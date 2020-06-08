package ru.job4j.lambda;

import java.util.List;
import java.util.stream.Collectors;

public class ManTest {

    String name;
    List<String> pets;

    public ManTest(String name, List<String> pets) {
        this.name = name;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPets() {
        return pets;
    }

    public void setPets(List<String> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "name is " + name;
    }
}
