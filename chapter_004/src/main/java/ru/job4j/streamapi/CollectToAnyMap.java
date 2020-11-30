package ru.job4j.streamapi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Ранее мы сталкивались с реализацией toMap с тремя аргументами.
 * Этот метод перегружен и имеет реализацию с четырьмя аргументами,
 * где в качестве четвертого аргумента мы можем указать реализацию Map, которую мы хотим получить.
 *
 * Например
 *
 * Map<Integer, Integer> map = List.of(1, 2, 1).stream().collect(Collectors.toMap(k -> k, v -> v, (prev, curr) -> prev, TreeMap::new));
 *
 * В данном случае мы получим реализацию Map, но только TreeMap.
 */

public class CollectToAnyMap {
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toMap(k -> k, v -> v * v, (prev, curr) -> prev, LinkedHashMap::new));
    }
}
