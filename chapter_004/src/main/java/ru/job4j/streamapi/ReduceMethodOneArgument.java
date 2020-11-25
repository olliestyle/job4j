package ru.job4j.streamapi;

import java.util.List;
import java.util.Scanner;

/**
 * reduce() метод находит первый элемент стрима, он становится результатом, а потом уже начинает применять оператор к последующим элементам.
 * возвращает Optional
 */
public class ReduceMethodOneArgument {
    public static Integer reduce(List<Integer> list) {
        return list.stream().reduce((n1, n2) -> n1 * n2).get();
    }
}
