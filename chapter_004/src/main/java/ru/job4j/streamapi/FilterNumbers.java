package ru.job4j.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class FilterNumbers {
    public static List<Integer> filter(List<Integer> data) {
        return data.stream().filter(el -> el % 2 == 0).collect(Collectors.toList());
    }
}
