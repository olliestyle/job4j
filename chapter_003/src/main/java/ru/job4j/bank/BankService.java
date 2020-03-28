package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {

    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        List<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);
    }

    public void addAccount(String passport, Account account) throws UserNotFoundException {
        User user = findByPassport(passport);
        List<Account> accounts = users.get(user);
        if (accounts.contains(account)) {
            System.out.println("There is already exist account that you want to add");
        } else {
            accounts.add(account);
        }
    }

    public User findByPassport(String passport) throws UserNotFoundException {
        User userToReturn = null;
        for(User user: users.keySet()) {
            if(!passport.equals(user.getPassport())) {
                throw new UserNotFoundException("No user with same passport data");
            }
            userToReturn = user;
        }
        return userToReturn;
    }

    public Account findByRequisite(String passport, String requisite) throws UserNotFoundException, AccountNotFoundException {
        User user = findByPassport(passport);
        List<Account> accountList = users.get(user);
        for(Account accountToFind: accountList) {
            if(accountToFind.getRequisite().equals(requisite)) {
                return accountToFind;
            }
        }
        throw new AccountNotFoundException("No account found");
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) throws UserNotFoundException, AccountNotFoundException {
        boolean rsl = false;
        Account accountFromTransfer = findByRequisite(srcPassport, srcRequisite);
        Account accountToTransfer = findByRequisite(destPassport, destRequisite);
        if(accountFromTransfer != null && accountToTransfer != null && accountFromTransfer.getBalance() <= accountToTransfer.getBalance()) {
            accountFromTransfer.setBalance(accountFromTransfer.getBalance() - amount);
            accountToTransfer.setBalance(accountToTransfer.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        String requisite = "3fdsbb9";
        accounts.add(new Account("3fdsbb9", 140));
        int index = accounts.indexOf(new Account(requisite, -1));
        Account find = accounts.get(index);
        System.out.println(find.getRequisite() + " -> " + find.getBalance());
        BankService bankService = new BankService();
        bankService.addUser(new User("hello", "murat"));
        try {
            bankService.addAccount("hello", new Account("333", 50));
        } catch (UserNotFoundException unfe) {
            System.out.println("UserNotFound");
        }
        try {
            bankService.addAccount("hello", new Account("333", 50));
        } catch (UserNotFoundException unfe) {
            System.out.println("UserNotFound");
        }
        try {
            bankService.addAccount("hell", new Account("333", 50));
        } catch (UserNotFoundException unfe) {
            System.out.println("UserNotFound");
        }
    }
}
