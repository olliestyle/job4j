package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class SqMaxTest {

    @Test
    public void whenFirstMax() {
        int result = SqMax.max(4, 3, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax() {
        int result = SqMax.max(3, 4, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        int result = SqMax.max(2, 3, 4, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenFourthMax() {
        int result = SqMax.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void allEquals() {
        int result = SqMax.max(3, 3, 3, 3);
        assertThat(result, is(3));
    }

    @Test
    public void with6473() {
        int result = SqMax.max(6, 4, 7, 3);
        assertThat(result, is(7));
    }

}
