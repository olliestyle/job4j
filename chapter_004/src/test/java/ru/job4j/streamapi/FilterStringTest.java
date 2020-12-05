package ru.job4j.streamapi;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FilterStringTest {
    @Test
    public void testFilter() {
        assertThat(FilterString.filterString(List.of("A.java", "lop", "Animal.java", "cool")), is(List.of("A.java", "Animal.java")));
    }
}