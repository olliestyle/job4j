package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerMatrix {

    static List<Integer[][]> matrix = List.of(new Integer[][]{new Integer[]{1, 2, 3}, new Integer[]{4, 5, 6}}, new Integer[][]{new Integer[]{7, 8, 9}, new Integer[]{10, 11, 12}});
    static Integer[][] matrix2 = new Integer[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    public static void main(String[] args) {
        List<Integer> result = matrix.stream().flatMap(integers -> Stream.of(integers)).flatMap(integers -> Stream.of(integers)).collect(Collectors.toList());
        List<Integer> result2 = Stream.of(matrix2).flatMap(integers -> Stream.of(integers)).collect(Collectors.toList());
        System.out.println(result);
        System.out.println(result2);
    }
}
