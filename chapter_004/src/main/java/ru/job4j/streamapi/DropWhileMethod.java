package ru.job4j.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class DropWhileMethod {
    public static List<Integer> dropWhileMethod(List<Integer> numbers) {
        return numbers.stream().sorted().dropWhile(number -> number < 0).collect(Collectors.toList());
    }
}
