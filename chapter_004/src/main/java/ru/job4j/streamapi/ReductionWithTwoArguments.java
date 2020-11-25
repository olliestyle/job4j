package ru.job4j.streamapi;

import java.util.List;

/**
 * Иногда нам может понадобиться произвести редукцию с начальным значение.
 * Для этого есть перегруженный метод reduce().
 * Первый аргумент начальное значение, второй оператор.
 * В отличие от первого метода, который принимает один аргумент, этот метод возвращает начальное значение(первый параметр) для пустого списка, а не Optional.
 *
 * Например, прибавим числа списка к 10
 *
 * Integer sum = List.of(1, 2, 3).stream().reduce(10, (n1, n2) -> n1 + n2); // 16
 *
 * Integer sum = List.of().stream().reduce(10, (n1, n2) -> n1 + n2); // 10, т.к. список пуст
 */
public class ReductionWithTwoArguments {
    public static Integer reduce(List<Integer> list) {
        return list.stream().reduce(5, (n1, n2) -> n1 * n2);
    }
}
