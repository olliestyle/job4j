package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConvertListTest {
    @Test
    public void whenTwoList() {
        List<int[]> input = new ArrayList<>();
        input.add(new int[] {1, 2});
        input.add(new int[] {3, 4, 5, 6});
        List<Integer> result = ConvertList.convert(input);
        List<Integer> expect = List.of(1, 2, 3, 4, 5, 6);
        assertThat(result, is(expect));
    }

    @Test
    public void whenFourList() {
        List<int[]> input = new ArrayList<>();
        input.add(new int[] {1, 2});
        input.add(new int[] {3, 4, 5, 6});
        input.add(new int[] {7});
        input.add(new int[] {8, 9, 10, 11, 12, 13});
        List<Integer> result = ConvertList.convert(input);
        List<Integer> expect = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        assertThat(result, is(expect));
    }
}
