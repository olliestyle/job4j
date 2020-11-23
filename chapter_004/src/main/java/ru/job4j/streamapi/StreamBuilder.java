package ru.job4j.streamapi;

import java.util.stream.Stream;

/**
 * Create stream.builder()
 */
public class StreamBuilder {
    public static Stream<Object> createStream(Integer[] data) {
        return Stream.builder().add(data[0]).add(data[data.length - 1]).build();
    }
}
