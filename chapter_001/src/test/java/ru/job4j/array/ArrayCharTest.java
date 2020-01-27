package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {

    @Test
    public void whenStartsWithPrefixTrue() {
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        char[] pref = {'h', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenStartsWithPrefixFalse() {
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        char[] pref = {'h', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }

    @Test
    public void whenStartsWithPrefixTrue1() {
        char[] word = {'h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd'};
        char[] pref = {'h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenStartsWithPrefixFalse1() {
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        char[] pref = {'h', 'E', 'l'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }
}
