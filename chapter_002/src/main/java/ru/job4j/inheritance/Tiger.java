package ru.job4j.inheritance;

public class Tiger extends Predator {

    public Tiger() {
        super();
        System.out.println("In Tiger Constructor");
    }

    public Tiger(String name) {
        super(name);
        System.out.println("In Tiger Constructor with String param");
    }
}
