package ru.job4j.streamapi;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MapToIntMethodTest {
    @Test
    public void test() {
        assertThat(MapToIntMethod.sum(List.of('h', 'e', 'l', 'l')), is(421L));
    }
}