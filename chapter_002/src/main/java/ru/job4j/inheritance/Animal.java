package ru.job4j.inheritance;

public class Animal {

    public Animal() {
        super();
        System.out.println("In Animal Constructor");
    }

    public Animal(String name) {
        name = "animalName";
        System.out.println("In Animal Constructor with String param");
        System.out.println(name);
    }

    public static void main(String[] args) {
        String hello = "";
        Tiger tiger = new Tiger(hello);
    }
}
