package ru.job4j.streamapi;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * public interface Collector<T, A, R> {
 *     Supplier<A> supplier();
 *     BiConsumer<A, T> accumulator();
 *     Function<A, R> finisher();
 *     BinaryOperator<A> combiner();
 *     Set<Characteristics> characteristics();
 * }
 *
 * T is the type of items in the stream to be collected
 * A is the type of the accumulator
 * R is the type of the result returned by the collector
 *
 * Supplier
 * The supplier() must return a function that creates an empty accumulator.
 * This will also represent the result of the collection process when applied on an empty stream.
 *
 * Accumulator
 * The job of the accumulator() is to return a function which performs the reduction operation.
 * It accepts two arguments.
 * First one being the mutable result container (accumulator) and the second one the stream element that should be folded into the result container.
 *
 * Finisher
 * The finisher() returns a function which performs the final transformation from the intermediate result container to the final result of type R.
 * Often times the accumulator already represents the final result, so the finisher can return the identity function.
 *
 * Combiner
 * When the stream is collected in parallel then the combiner() method is used to return a function which knows how to merge two accumulators.
 *
 * Characteristics
 * Finally, the characteristics() method returns an immutable set of Characteristics which define the behavior of the collector.
 * This is used to check which kind of optimizations can be done during the reduction process.
 * For example, if the set contains CONCURRENT, then the collection process can be performed in parallel.
 */

public class CollectorClass {
    public static List<Integer> collect(List<Integer> list) {
        // определяем, в какую коллекцию сохранить результат
        // The supplier() must return a function that creates an empty accumulator.
        // This will also represent the result of the collection process when applied on an empty stream.
        Supplier<List<Integer>> supplier = LinkedList::new;
        // указываем, как будут собираться в коллекцию элементы
        // The job of the accumulator() is to return a function which performs the reduction operation.
        // It accepts two arguments.
        // First one being the mutable result container (accumulator) and the second one the stream element that should be folded into the result container.
        BiConsumer<List<Integer>, Integer> accumulator = List::add;
        // оператор совмещения
        // When the stream is collected in parallel then the combiner() method is used to return a function which knows how to merge two accumulators.
        BinaryOperator<List<Integer>> combiner = (left, right) -> {
            left.addAll(right);
            return left;
        };
        return list.stream().collect(Collector.of(supplier, accumulator, combiner));
    }

    public static String collectFinisher(List<Integer> list) {

        // определяем, в какую коллекцию сохранить результат
        // The supplier() must return a function that creates an empty accumulator.
        // This will also represent the result of the collection process when applied on an empty stream.
        Supplier<List<Integer>> supplier = LinkedList::new;
        // указываем, как будут собираться в коллекцию элементы
        // The job of the accumulator() is to return a function which performs the reduction operation.
        // It accepts two arguments.
        // First one being the mutable result container (accumulator) and the second one the stream element that should be folded into the result container.
        BiConsumer<List<Integer>, Integer> accumulator = List::add;
        // оператор совмещения
        // When the stream is collected in parallel then the combiner() method is used to return a function which knows how to merge two accumulators.
        BinaryOperator<List<Integer>> combiner = (left, right) -> {
            left.addAll(right);
            return left;
        };
        // The finisher() returns a function which performs the final transformation from the intermediate result container to the final result of type R.
        // Often times the accumulator already represents the final result, so the finisher can return the identity function.
        Function<List<Integer>, String> finiser = x -> String.valueOf(x.get(0));

        return list.stream().collect(Collector.of(supplier, accumulator, combiner, finiser));
    }
}
