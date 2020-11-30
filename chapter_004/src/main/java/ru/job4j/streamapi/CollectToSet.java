package ru.job4j.streamapi;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToSet {
    public static Set<Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toSet());
    }
}
