package ru.job4j.streamapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Если нам нужно подсчитать сумму элементов при группировке, то можем использовать коллектор Collectors.summingInt().
 * Этот коллектор суммирует в int.
 * Он принимает функцию в которой мы должны преобразовать наш объект к int
 */

public class SummingMethod {
    public static class User {

        private String name;

        private List<Bill> bills;

        public User(String name, List<Bill> bills) {
            this.name = name;
            this.bills = bills;
        }

        public String getName() {
            return name;
        }

        public List<Bill> getBills() {
            return bills;
        }
    }

    public static class Bill {

        private int balance;

        public Bill(int balance) {
            this.balance = balance;
        }

        public int getBalance() {
            return balance;
        }
    }

    private static class Pair {
        private User user;
        private Bill bill;

        public Pair(User user, Bill bill) {
            this.user = user;
            this.bill = bill;
        }

        public User getUser() {
            return user;
        }

        public Bill getBill() {
            return bill;
        }
    }

    public static Map<String, Integer> summing1(List<User> users) {
        return users
                .stream()
                .collect(Collectors.groupingBy(user -> user.getName(),
                         Collectors.summingInt(user -> user.getBills().stream().map(n -> n.getBalance()).reduce((n1, n2) -> n1 + n2).get())));
    }

    public static Map<String, Integer> summing2(List<User> users) {
         return users
                .stream()
                .map(user -> user.getBills()
                        .stream()
                        .map(bill -> new Pair(user, bill))
                        .collect(Collectors.toList()))
                .flatMap(pairs -> pairs.stream())
                .collect(Collectors.groupingBy(pair -> pair.getUser().getName(),
                                               Collectors.summingInt(pair -> pair.getBill().getBalance())));
    }

}
