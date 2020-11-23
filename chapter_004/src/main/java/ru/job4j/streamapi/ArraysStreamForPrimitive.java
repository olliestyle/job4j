package ru.job4j.streamapi;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Create stream from primitive
 */
public class ArraysStreamForPrimitive {
    public static IntStream createStream(int[] data) {
        return Arrays.stream(data);
    }
}
