package ru.job4j.streamapi;

import java.util.List;

/**
 * поиск минимального элемента представляет собой также редукцию.
 * Этот метод принимает Comparator и возвращает Optional.
 * Если список пуст вернется пустой Optional.
 * Пример:
 * Integer min = List.of(3, 2, 1).stream().min((n1, n2) -> Integer.compare(n1, n2)).get(); // вернет 1
 */
public class MinMethod {
    public static String min(List<String> list) {
        return list.stream().reduce((n1, n2) -> n1.length() < n2.length() ? n1 : n2).get();
    }
}
