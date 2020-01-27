package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(100, 50, 30);
        assertThat(result, is(100));
    }

    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(3, 77, 2);
        assertThat(result, is(77));
    }

    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(5, 6, 99);
        assertThat(result, is(99));
    }

    @Test
    public void whenAllequals() {
        MultiMax check = new MultiMax();
        int result = check.max(33, 33, 33);
        assertThat(result, is(33));
    }

}
