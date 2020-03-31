package ru.job4j.collection;

import java.util.Objects;

public class User implements Comparable<User>{

    private String name;
    private int age;

    public User(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return Objects.equals(name, user.name) && Objects.equals(age, user.age);
    }

    @Override
    public int compareTo(User o) {
        if(o.name.equals(name)) {
            return Integer.valueOf(age).compareTo(Integer.valueOf(o.age));
        } else {
            return name.compareTo(o.name);
        }
    }
}
