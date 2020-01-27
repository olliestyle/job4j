package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenLeftIsMax() {
        int left = 100;
        int right = 90;
        int result = Max.max(left, right);
        assertThat(result, is(left));
    }

    @Test
    public void whenRightIsMax() {
        int left = 1;
        int right = 55;
        int result = Max.max(left, right);
        assertThat(result, is(right));
    }

    @Test
    public void whenLeftEqualsRight() {
        int left = 32;
        int right = 32;
        int result = Max.max(left, right);
        assertThat(result, is(left));
    }

}
