package ru.job4j.ex;

import org.junit.Test;

public class CountTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenStartGreaterThanFinish() {
        Count.add(10, 3);
    }
}
