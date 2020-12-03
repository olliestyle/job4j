package ru.job4j.streamapi;

import java.util.List;

public class MapToIntMethod {
    public static long sum(List<Character> characters) {
        return characters.stream().mapToLong(character -> (long) character).sum();
    }
}
