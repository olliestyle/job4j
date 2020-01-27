package ru.job4j.array;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndsWithTrue() {
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenEndsWithFalse() {
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'l'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }

    @Test
    public void whenEndsWithPrefixTrue1() {
        char[] word = {'h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd'};
        char[] post = {'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, Is.is(true));
    }

    @Test
    public void whenEndsWithPrefixFalse1() {
        char[] word = {'h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd'};
        char[] post = {'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'z'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, Is.is(false));
    }

}
