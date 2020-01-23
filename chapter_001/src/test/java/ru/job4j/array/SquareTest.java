package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {

    @Test
    public void whenBound3Then149(){
        Square square = new Square();
        int[] rst = square.calculate(3);
        int[] expect = new int[]{1,4,9};
        assertThat(rst, is(expect));
    }

    @Test
    public void whenBound3Then14916253649(){
        Square square = new Square();
        int[] rst = square.calculate(7);
        int[] expect = new int[]{1,4,9,16,25,36,49};
        assertThat(rst, is(expect));
    }

    @Test
    public void whenBound3Then149162536496481100(){
        Square square = new Square();
        int[] rst = square.calculate(10);
        int[] expect = new int[]{1,4,9,16,25,36,49,64,81,100};
        assertThat(rst, is(expect));
    }
}
