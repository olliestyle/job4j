package ru.job4j.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentLevel {
        public static List<Student> levelOf(List<Student> students, int bound) {
            return students.stream()
                    .flatMap(Stream::ofNullable)
                    //.filter(st -> st.getScore() > bound)
                    .sorted((left, right) -> left.getScore() > right.getScore() ? 1 : left.getScore() == right.getScore() ? 0 : -1 )
                    .takeWhile(st -> st.getScore() > bound )
                    .collect(Collectors.toList());
        }
}
