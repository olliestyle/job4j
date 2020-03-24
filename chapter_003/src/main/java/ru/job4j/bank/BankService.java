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

    public void addAccount(String passport, Account account) {
        User user = this.findByPassport(passport);
        for(User userToFind: users.keySet()) {
            if (userToFind.equals(user)) {
                List<Account> accounts = users.get(userToFind);
                if (accounts.contains(account)) {
                    System.out.println("There is already exist account that you want to add");
                } else {
                    accounts.add(account);
                }
            }
        }
    }

    public User findByPassport(String passport) {
        for(User user: users.keySet()) {
            if(user.getPassport() == passport) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        for(User userToFind: users.keySet()) {
            if(userToFind.equals(user)) {
                List<Account> accountList = users.get(userToFind);
                for(Account accountToFind: accountList) {
                    if(accountToFind.getRequisite().equals(requisite)) {
                        return accountToFind;
                    }
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account accountFromTransfer = findByRequisite(srcPassport, srcRequisite);
        Account accountToTransfer = findByRequisite(destPassport, destRequisite);
        if(accountFromTransfer != null && accountToTransfer != null) {
            accountFromTransfer.setBalance(accountFromTransfer.getBalance() - amount);
            accountToTransfer.setBalance(accountToTransfer.getBalance() + amount);
            return true;
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
        bankService.addAccount("hello", new Account("333", 50));
        bankService.addAccount("hello", new Account("333", 50));
    }
}
