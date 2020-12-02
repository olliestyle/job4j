package ru.job4j.streamapi;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AllMatchMethodTest {
    @Test
    public void test1() {
        assertTrue(AllMatchMethod.check(List.of("hello", "onetwo", "call")));
    }

    @Test
    public void test2() {
        assertFalse(AllMatchMethod.check(List.of("hello", "onetwo", "call", "lol")));
    }
}