package ru.job4j.streamapi;

import java.util.Arrays;

/**
 * Стримы примитивов IntStream, LongStream, DoubleStream.
 * Обратите внимание, что это всё примитивы чисел, а к числам применимы арифметические операции,
 * поэтому в этих стримах есть терминальные операции min(), max(), sum(), average().
 *
 * min(), max() возвращают OptionalInt, для получения элемента нужно использовать метод getAsInt()
 *
 * average() возвращает OptionalDouble, для получения элемента нужно использовать метод getAsDouble()
 */

public class TerminalForPrimitive {

    private int[] data;

    public TerminalForPrimitive(int[] data) {
        this.data = data;
    }

    public long count() {
        return Arrays.stream(data).count();
    }

    public long max() {
        return Arrays.stream(data).max().getAsInt();
    }

    public long min() {
        return Arrays.stream(data).min().getAsInt();
    }

    public double avg() {
        return Arrays.stream(data).average().getAsDouble();
    }

    public long sum() {
        return Arrays.stream(data).sum();
    }
}
