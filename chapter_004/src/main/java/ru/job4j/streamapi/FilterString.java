package ru.job4j.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class FilterString {
    public static List<String> filterString(List<String> list) {
        return list.stream()
                .filter(str -> str.startsWith("A"))
                .filter(str -> str.endsWith(".java"))
                .collect(Collectors.toList());
    }
}
