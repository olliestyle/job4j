package ru.job4j.streamapi;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BoxedMethodTest {
    @Test
    public void test() {
        assertThat(BoxedMethod.boxed(new int[]{1, 2, 3}), is(List.of(1, 2, 3)));
    }
}