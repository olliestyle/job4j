package ru.job4j.lambda;

public class PersonTest {
    public static void main(String[] args) {
        PersonFactory pf = (firstName, lastName) -> new Person(firstName, lastName);
        Person person = (Person) pf.create("Abib", "Gava");

        System.out.println(person);
    }
}
