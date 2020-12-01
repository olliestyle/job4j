package ru.job4j.streamapi;

import java.util.stream.Stream;

public class CountMethod {

    public static long count(Stream<Integer> data) {
        return data.count();
    }
}
