package ru.job4j.lambda;

import java.util.*;
import java.util.function.Consumer;

public class RefMethod {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Petr Arsentev", "Ivan");
//        Consumer<String> out = (name) -> System.out.println(name);
//        Consumer<String> out = (name) -> cutOut(name);
        Consumer<String> out = RefMethod::cutOut;
        names.forEach(out);
    }

    public static void cutOut(String x) {
        if (x.length() > 10) {
            System.out.println(x.substring(0, 10) + "..");
        } else {
            System.out.println(x);
        }
    }
}
