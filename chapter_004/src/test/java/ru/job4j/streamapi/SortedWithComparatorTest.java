package ru.job4j.streamapi;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SortedWithComparatorTest {
    @Test
    public void test() {
        assertEquals(
                List.of("c", "b", "a"),
                SortedWithComparator.sortReverse(List.of("a", "b", "c"))
        );
    }
}