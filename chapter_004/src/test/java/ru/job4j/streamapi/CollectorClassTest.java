package ru.job4j.streamapi;


import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CollectorClassTest {
    @Test
    public void test() {
        assertEquals(
                List.of(1, 2, 3),
                CollectorClass.collect(List.of(1, 2, 3))
        );
    }

    @Test
    public void testWithFinisher() {
            assertEquals(
                    "1",
                    CollectorClass.collectFinisher(List.of(1, 2, 3))
            );
    }
}