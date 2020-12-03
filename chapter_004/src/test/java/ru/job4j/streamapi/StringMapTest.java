package ru.job4j.streamapi;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class StringMapTest {
    @Test
    public void test() {
        assertThat(StringMap.map(List.of("hello", "super")), is(List.of("hello.java", "super.java")));
    }
}