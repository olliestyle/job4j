package ru.job4j.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class LimitMethod {
    public static List<Integer> limitInt(List<Integer> list) {
        return list.stream().limit(3).collect(Collectors.toList());
    }
}
