package ru.job4j.pseudo;

import org.junit.Test;
import ru.job4j.strategy.Triangle;

import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(triangle.draw(), is(new StringJoiner(System.lineSeparator())
        .add("   x   ")
        .add("  xxx  ")
        .add(" xxxxx ")
        .add("xxxxxxx")
        .toString()));
    }
}
