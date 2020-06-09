package ru.job4j.lambda;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Group {

    static class Holder {
        String key, value;

        Holder(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public static Map<String, Set<String>> sections(List<Student> students) {

        return students.stream()
                // из стрима students мы через метод flatMap должны получить от каждого студента несколько объектов Holder(секция, имяСтудента)
                // каждую секцию мы получаем через метод map, который применяем к множеству units и для каждой секции(unit) получаем новый Holder(unit, name)
                .flatMap(student -> student.getUnits().stream().map(unit -> new Holder(unit, student.getName())))
                // т.е. сейчас у нас стрим Holder'ов
                .collect(Collectors.groupingBy(holder -> holder.key, // Collectors.groupingBy создаёт ключи, проходя по всем Holder'ам и вытаскивая key
                        Collector.of(HashSet::new, // аккумулятор - ссылка на конструктор - создаём объект HashSet
                                (set, el) -> set.add(el.value), // тут у нас BiConsumer, который принимает два значения и ничего не возвращает, просто добавляем в HashSet элементы
                                (left, right) -> { left.addAll(right); return left; } // для агрегации, что здесь происходит ? Мы здесь добавляем в set, который создали, set, который саккумулировали ?
                                )));
    }
}


