package ru.job4j.lambda;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    public static List<Student> collect(List<Student> students, Predicate<Student> predicate) {
        List<Student> resultClass = students.stream().filter(predicate).collect(Collectors.toList());
        return resultClass;
    }
}
