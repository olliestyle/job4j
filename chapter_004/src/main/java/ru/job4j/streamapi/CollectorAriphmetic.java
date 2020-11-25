package ru.job4j.streamapi;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CollectorAriphmetic {
    public static Integer collect(List<Integer> list) {
        Supplier<List<Integer>> supplier = LinkedList::new;
        BiConsumer<List<Integer>, Integer> accumulator = List::add;
        BinaryOperator<List<Integer>> combiner = (left, right) -> {
            left.addAll(right);
            return left;
        };
        Function<List<Integer>, Integer> finisher = (ns) -> {
            int number = 1;
            for (Integer n : ns) {
                number *= n;
            }
            return number;
        };
        return list.stream()
                .collect(Collector.of(supplier, accumulator, combiner, finisher));
    }
}
