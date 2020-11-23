package ru.job4j.streamapi;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 *  Создание стрима примитивов. Методы range() и rangeClosed()
 * Стримы целых чисел (IntStream, LongSteam) имеют также еще один способ создания стрима. Это методы range(int start, int end) и rangeClosed(int start, int end)
 * Первый метод, создает стрим в диапозоне [start, end)
 * Второй метод, создает стрим в диапозоне [start, end]
 * Например,
 * IntStream.range(1, 5) => [1, 2, 3, 4]
 * IntStream.rangeClosed(1, 5) => [1, 2, 3, 4, 5]
 */
public class RangeMethodTest {
    @Test
    public void test() {
        List<Integer> result = RangeMethod.createStream(1, 3).boxed().collect(Collectors.toList());
        List<Integer> expect = List.of(1, 2, 3);
        assertEquals(expect, result);
    }
}