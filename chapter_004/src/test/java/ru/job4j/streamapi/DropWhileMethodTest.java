package ru.job4j.streamapi;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DropWhileMethodTest {
    @Test
    public void testDropWhile() {
        assertThat(DropWhileMethod.dropWhileMethod(List.of(1, -1, 2, -2, 3, -3, 4)),
                is(List.of(1, 2, 3, 4)));
    }
}