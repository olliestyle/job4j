package ru.job4j.streamapi;

import java.util.List;

public class AllMatchMethod {
    public static boolean check(List<String> strings) {
        return strings.stream().allMatch(str -> str.length() > 3);
    }
}
