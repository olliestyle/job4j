package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSortFive() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortThree() {
        int[] input = new int[] {3, 4, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 3, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortTen() {
        int[] input = new int[] {3, 4, 1, 0, 2, 8, 7, 5, 9, 6};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortTwo() {
        int[] input = new int[] {4, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortOne() {
        int[] input = new int[] {1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1};
        assertThat(result, is(expect));
    }
}
