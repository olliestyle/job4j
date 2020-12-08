package ru.job4j.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class OptionalStream {
    public static class PhoneNumber {

        private String phone;

        public PhoneNumber(String phone) {
            this.phone = phone;
        }

        public String getPhone() {
            return phone;
        }
    }

    public static class User {

        private int id;

        private List<PhoneNumber> numbers;

        public User(int id, List<PhoneNumber> numbers) {
            this.id = id;
            this.numbers = numbers;
        }

        public int getId() {
            return id;
        }

        public List<PhoneNumber> getNumbers() {
            return numbers;
        }
    }

    public static List<PhoneNumber> collectNumber(List<User> users, int id, String region) {
        List<PhoneNumber> res = users.stream()
                .filter(user -> user.id == id)
                .findFirst()
                .stream()
                .flatMap(user -> user.getNumbers().stream())
                .filter(phone -> phone.getPhone().startsWith(region))
                .collect(Collectors.toList());
        return res;
    }
}
