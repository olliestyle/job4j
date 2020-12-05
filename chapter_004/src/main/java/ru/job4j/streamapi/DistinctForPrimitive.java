package ru.job4j.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctForPrimitive {
    public static List<Integer> collect(int[] data) {
        return Arrays.stream(data).distinct().mapToObj(n -> Integer.valueOf(n)).collect(Collectors.toList());
    }
}
