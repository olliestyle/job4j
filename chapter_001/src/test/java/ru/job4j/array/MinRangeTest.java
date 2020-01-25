package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinRangeTest {

    @Test
    public void whenFirstMin() {
        assertThat(
                MinRange.findMin(
                        new int[] {-1, 0, 5, 10},
                        1, 3
                ),
                is(0)
        );
    }

    @Test
    public void whenLastMin() {
        assertThat(
                MinRange.findMin(
                        new int[] {10, 5, 3, 1},
                        1, 3
                ),
                is(1)
        );
    }

    @Test
    public void whenMiddleMin() {
        assertThat(
                MinRange.findMin(
                        new int[] {10, 2, 5, 1},
                        0, 2
                ),
                is(2)
        );
    }

    @Test
    public void whenMin1(){
        assertThat(MinRange.findMin(new int[]{7,6,5,4,3,2,1},2,6), is(1));
    }
}
