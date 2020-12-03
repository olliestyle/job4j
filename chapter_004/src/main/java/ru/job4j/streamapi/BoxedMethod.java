package ru.job4j.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BoxedMethod {
    public static List<Integer> boxed(int[] data) {
        return Arrays.stream(data).boxed().collect(Collectors.toList());
    }
}
