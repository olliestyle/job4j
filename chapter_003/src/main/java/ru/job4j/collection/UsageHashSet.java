package ru.job4j.collection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<String>();
        autos.add("Lada");
        autos.add("BWM");
        autos.add("Volvo");
        autos.add("Toyota");
        for(String element: autos) {
            System.out.println(element);
        }
    }
}
