package ru.job4j.lambda;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

public class BiconsumerTest {

    public static void main(String[] args) {
        BinaryOperator<String> op = (string, integer) -> string.substring(0, 2) + integer.substring(0, 3);

        System.out.println(op.apply("Hello", "Hello"));

    }
}
