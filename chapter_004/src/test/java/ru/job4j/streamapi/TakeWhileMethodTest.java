package ru.job4j.streamapi;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TakeWhileMethodTest {
    @Test
    public void testTakeWhile() {
        assertThat(TakeWhileMethod.takeWhileNegative(List.of(1, 2, 3, 4, -5, -10, 2, -3, -4, 6)),
                is(List.of(-10, -5, -4, -3)));
    }
}