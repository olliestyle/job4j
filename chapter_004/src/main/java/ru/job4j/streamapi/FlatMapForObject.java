package ru.job4j.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapForObject {
    public static List<Integer> flatMap(List<List<Integer>> lists) {
        return lists.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
    }
}
