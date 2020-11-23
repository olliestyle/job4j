package ru.job4j.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;
/**
    Create stream from array
 */
public class ArraysStreamMethod {
    public static Stream<Integer> createStream(Integer[] data) {
        //return Stream.of(data);
        return Arrays.stream(data);
    }

}
