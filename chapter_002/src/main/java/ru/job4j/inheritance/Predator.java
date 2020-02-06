package ru.job4j.inheritance;

public class Predator extends Animal {

    public Predator() {
        super();
        System.out.println("In Predator Constructor");
    }

    public Predator(String name) {
        super(name);
        System.out.println("In Predator Constructor with String param");
    }
}
