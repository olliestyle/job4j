package ru.job4j.streamapi;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CharsMethodTest {
    @Test
    public void test() {
        assertThat(CharsMethod.symbols("hello"), is(List.of('h', 'e', 'l', 'l', 'o')));
    }
}