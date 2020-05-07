package ru.job4j.lambda;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    public static List<Student> collect(List<Student> students, Predicate<Student> predicate) {
        List<Student> resultClass = students.stream().filter(predicate).collect(Collectors.toList());
        return resultClass;
    }

    public static Map<Integer, Student> collectToMap(List<Student> students, Function <Student, Integer> keyMapper,
                                                     Function<Student, Student> valueMapper) {
        return students.stream().distinct().collect(Collectors.toMap(keyMapper, valueMapper));
    }
}
