package ru.job4j.streamapi;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ReductionWithTwoArgumentsTest {
    @Test
    public void test() {
        assertEquals(Integer.valueOf(5), ReductionWithTwoArguments.reduce(List.of()));
        assertEquals(Integer.valueOf(5), ReductionWithTwoArguments.reduce(List.of(1)));
        assertEquals(Integer.valueOf(10), ReductionWithTwoArguments.reduce(List.of(1, 2)));
        assertEquals(Integer.valueOf(30), ReductionWithTwoArguments.reduce(List.of(1, 2, 3)));
    }
}