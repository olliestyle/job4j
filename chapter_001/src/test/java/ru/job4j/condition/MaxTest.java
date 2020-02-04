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

    @Test
    public void whenFirstMax() {
        Max check = new Max();
        int result = check.max(100, 50, 30);
        assertThat(result, is(100));
    }

    @Test
    public void whenSecondMax() {
        Max check = new Max();
        int result = check.max(3, 77, 2);
        assertThat(result, is(77));
    }

    @Test
    public void whenThirdMax() {
        Max check = new Max();
        int result = check.max(5, 6, 99);
        assertThat(result, is(99));
    }

    @Test
    public void whenAllequals() {
        Max check = new Max();
        int result = check.max(33, 33, 33);
        assertThat(result, is(33));
    }

    @Test
    public void whenFirstMaxFourParams() {
        int result = Max.max(4, 3, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMaxFourParams() {
        int result = Max.max(3, 4, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMaxFourParams() {
        int result = Max.max(2, 3, 4, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenFourthMaxFourParams() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void allEqualsFourParams() {
        int result = Max.max(3, 3, 3, 3);
        assertThat(result, is(3));
    }

    @Test
    public void with6473FourParams() {
        int result = Max.max(6, 4, 7, 3);
        assertThat(result, is(7));
    }
}
