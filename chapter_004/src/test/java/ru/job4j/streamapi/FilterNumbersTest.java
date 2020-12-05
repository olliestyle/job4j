package ru.job4j.streamapi;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FilterNumbersTest {
    @Test
    public void testFilter() {
        assertThat(FilterNumbers.filter(List.of(1, 2, 3, 4, 5, 6, 7, 8)), is(List.of(2, 4, 6, 8)));
    }
}