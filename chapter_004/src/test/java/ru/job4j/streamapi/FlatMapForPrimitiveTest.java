package ru.job4j.streamapi;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FlatMapForPrimitiveTest {
    @Test
    public void test() {
        assertThat(FlatMapForPrimitive.sum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8}, {9}}), is(45));
    }
}