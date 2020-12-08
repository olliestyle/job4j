package ru.job4j.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileMethod {
    public static List<Integer> takeWhileNegative(List<Integer> numbers) {
        return numbers.stream().sorted().takeWhile(number -> number < 0).collect(Collectors.toList());
    }
}
