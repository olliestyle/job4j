package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BankService {

    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        List<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user == null) {
            System.out.println("User not found");
        } else {
            List<Account> accounts = users.get(user);
            if (accounts.contains(account)) {
                System.out.println("There is already exist account that you want to add");
            } else {
                accounts.add(account);
            }
        }

    }

    public User findByPassport(String passport) {
        return users.keySet().stream().filter(user -> user.getPassport().equals(passport)).findFirst().orElse(null);
//        for (User user: users.keySet()) {
//            if (passport.equals(user.getPassport())) {
//                return user;
//            }
//        }
//        return null;
    }

    public Account findByRequisite(String passport, String requisite) throws AccountNotFoundException {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accountList = users.get(user);
            Account accountToFind = accountList.stream().filter(account -> account.getRequisite().equals(requisite)).findFirst().orElse(null);
            if(accountToFind == null) {
                throw new AccountNotFoundException("No account found");
            }
            return accountToFind;
//            for (Account accountToFind: accountList) {
//                if (accountToFind.getRequisite().equals(requisite)) {
//                    return accountToFind;
//                }
//            }
//            throw new AccountNotFoundException("No account found");
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) throws AccountNotFoundException {
        boolean rsl = false;
        Account accountFromTransfer = findByRequisite(srcPassport, srcRequisite);
        Account accountToTransfer = findByRequisite(destPassport, destRequisite);
        if (accountFromTransfer != null && accountToTransfer != null && accountFromTransfer.getBalance() >= amount) {
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
    }
}
