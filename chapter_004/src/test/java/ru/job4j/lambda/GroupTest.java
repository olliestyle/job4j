package ru.job4j.lambda;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GroupTest {

    @Test
    public void firstTest() {
        List<Student> students = List.of(
                new Student("Ivan", Set.of("FootBall", "BasketBall", "VolleyBall")),
                new Student("Oleg", Set.of("FootBall", "Hockey", "Chess")),
                new Student("Egor", Set.of("Pool", "BasketBall", "Chess"))
        );

        Map<String, Set<String>> expected = Map.of(
                "FootBall", Set.of("Ivan", "Oleg"),
                "BasketBall", Set.of("Ivan", "Egor"),
                "VolleyBall", Set.of("Ivan"),
                "Hockey", Set.of("Oleg"),
                "Chess", Set.of("Oleg", "Egor"),
                "Pool", Set.of("Egor")
        );

        Map<String, Set<String>> result = Group.sections(students);
        assertThat(result, is(expected));
    }

}