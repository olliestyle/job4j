package ru.job4j.streamapi;

import java.util.Arrays;

public class FlatMapForPrimitive {
    public static int sum(int[][] matrix) {
        return Arrays.stream(matrix).flatMapToInt(mat -> Arrays.stream(mat)).sum();
    }
}
