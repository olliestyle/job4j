package ru.job4j.streamapi;

import java.util.List;

public class NoneMatchMethod {
    public static boolean check(List<String> list) {
        return list.stream().noneMatch(str -> str.isEmpty());
    }
}
