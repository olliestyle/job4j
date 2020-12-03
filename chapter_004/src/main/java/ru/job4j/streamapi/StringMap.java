package ru.job4j.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class StringMap {
    public static List<String> map(List<String> list) {
        return list.stream().map(str -> str + ".java").collect(Collectors.toList());
    }
}
