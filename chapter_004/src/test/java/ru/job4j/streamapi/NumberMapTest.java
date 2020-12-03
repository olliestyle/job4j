package ru.job4j.streamapi;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class NumberMapTest {
    @Test
    public void test() {
        assertThat(NumberMap.map(List.of(2, 3, 4)), is(List.of(4, 9, 16)));
    }
}