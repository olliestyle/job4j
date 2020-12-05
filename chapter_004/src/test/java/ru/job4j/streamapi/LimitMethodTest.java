package ru.job4j.streamapi;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LimitMethodTest {
    @Test
    public void testLimit() {
        assertThat(LimitMethod.limitInt(List.of(1, 2, 3, 4, 5, 6, 7)), is(List.of(1, 2, 3)));
    }
}