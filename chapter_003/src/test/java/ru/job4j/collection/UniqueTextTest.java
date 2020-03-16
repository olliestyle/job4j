package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UniqueTextTest {
    @Test
    public void whenTextIsEquals() {
        String origin = "my cat eats a mouse";
        String text = "my cat eats a mouse";
        assertThat(UniqueText.isEquals(origin, text), is(true));
    }

    @Test
    public void whenTextIsNotEquals() {
        String origin = "my cat eats a mouse";
        String text = "A mouse is eaten by cat";
        assertThat(UniqueText.isEquals(origin, text), is(false));
    }
}
