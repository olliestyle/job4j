package ru.job4j.streamapi;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Для того чтобы собрать данные в мапу, мы можем использовать методы collect() и Collectors.toMap().
 * Сборка идет в HashMap
 * Пример:
 * Map<Integer, Integer> result = Set.of(1, 2).stream().collect(Collectors.toMap(k -> k, v -> v));
 * В качестве первого аргумента мы указываем, как мы будет строить ключ из элемента стрима, а в качестве второго как будем строить значение.
 */

public class CollectToMap {
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toMap(k -> k, v -> v * v));
    }
}
