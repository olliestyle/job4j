package ru.job4j.bank;

import java.util.*;
import java.util.stream.Collectors;

public class BankService {

    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        List<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);
    }

    public void addAccount(String passport, Account account) {
//        User user = findByPassport(passport);
        Optional<User> user = findByPassport(passport);
        if (!user.isPresent()) {
            System.out.println("User not found");
        } else {
            List<Account> accounts = users.get(user.get());
            if (accounts.contains(account)) {
                System.out.println("There is already exist account that you want to add");
            } else {
                accounts.add(account);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
//        return users.keySet().stream().filter(user -> user.getPassport().equals(passport)).findFirst().orElse(null);
        Optional<User> optUser = Optional.empty();
        for (User user: users.keySet()) {
            if (passport.equals(user.getPassport())) {
                return Optional.of(user);
            }
        }
        return optUser;
    }

    public Optional<Account> findByRequisite(String passport, String requisite) throws AccountNotFoundException {
//        User user = findByPassport(passport);
        Optional<User> user = findByPassport(passport);
        Optional<Account> accountToFind = Optional.empty();
        if (user.isPresent()) {
            List<Account> accountList = users.get(user.get());
//            Account accountToFind = accountList.stream().filter(account -> account.getRequisite().equals(requisite)).findFirst().orElse(null);
//            if(accountToFind == null) {
//                throw new AccountNotFoundException("No account found");
//            }
//            return accountToFind;
            for (Account account: accountList) {
                if (account.getRequisite().equals(requisite)) {
                    return Optional.of(account);
                }
            }
            throw new AccountNotFoundException("No account found");
        }
        return accountToFind;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) throws AccountNotFoundException {
        boolean rsl = false;
//        Account accountFromTransfer = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> accountFromTransfer = findByRequisite(srcPassport, srcRequisite);
//        Account accountToTransfer = findByRequisite(destPassport, destRequisite);
        Optional<Account> accountToTransfer = findByRequisite(destPassport, destRequisite);
        if (accountFromTransfer.isPresent() && accountToTransfer.isPresent() && accountFromTransfer.get().getBalance() >= amount) {
            accountFromTransfer.get().setBalance(accountFromTransfer.get().getBalance() - amount);
            accountToTransfer.get().setBalance(accountToTransfer.get().getBalance() + amount);
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
