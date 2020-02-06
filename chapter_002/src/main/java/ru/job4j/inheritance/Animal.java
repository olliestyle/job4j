package ru.job4j.inheritance;

public class Animal {

    public Animal() {
        super();
        System.out.println("In Animal Constructor");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
    }
}
