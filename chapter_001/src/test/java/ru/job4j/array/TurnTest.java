package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2, 3, 7, 12, 15, 19, 20};
        int[] result = turner.back(input);
        int[] expect = new int[] {20, 19, 15, 12, 7, 3, 2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2, 3, 7, 12, 15, 19};
        int[] result = turner.back(input);
        int[] expect = new int[] {19, 15, 12, 7, 3, 2, 6, 1, 4};
        assertThat(result, is(expect));
    }

}
