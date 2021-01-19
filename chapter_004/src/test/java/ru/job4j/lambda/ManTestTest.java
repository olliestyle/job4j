package ru.job4j.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ManTestTest {

    @Test
    public void simpleTest() {
        ManTest man1 = new ManTest("Petr", List.of("aaa", "bbb", "ccc"));
        ManTest man2 = new ManTest("Oleg", List.of("zzz", "yyy", "xxx"));
        List<ManTest> men = List.of(man1, man2);
        List<String> expected2 = List.of("Petr", "Oleg");
        List<String> expected = List.of("aaa", "bbb", "ccc", "zzz", "yyy", "xxx");

        Integer[] im = new Integer[]{1, 2, 3};
        Stream<Integer> hello = Arrays.stream(im);
        List<String> result = men.stream().flatMap(el -> Stream.of(el.getName())).collect(Collectors.toList());
        List<String> result2 = men.stream().map(el -> el.getName()).collect(Collectors.toList());
        ManTest manToFind = men.stream().findFirst().orElse(null);
        assertThat(manToFind, is("Oleg"));

    }
}
