package ru.job4j.streamapi;

import java.util.stream.Stream;

public class StreamOfMethod {
    public static Stream<Character> createStream() {
        return Stream.of('a', 'b', 'c');
    }

}
