package ru.job4j.pseudo;

import org.junit.Test;
import ru.job4j.strategy.Square;

import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {

    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(square.draw(), is(new StringJoiner(System.lineSeparator())
                .add("xxxx")
                .add("x  x")
                .add("x  x")
                .add("xxxx").toString()));
    }
}
