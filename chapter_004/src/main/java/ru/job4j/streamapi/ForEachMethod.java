package ru.job4j.streamapi;

import java.util.stream.Stream;

/**
 * Если нам нужно выполнить какое-то действие над каждым элементом стрима,
 * при этом нам не нужно ничего возвращать, то мы можем использовать метод forEach().
 *
 * Например,
 *
 * List.of(1, 2, 3).stream().forEach(n -> System.out.println(n));
 */

public class ForEachMethod {
    public static void show(Stream<Integer> data) {
        data.forEach(System.out::println);
    }
}
