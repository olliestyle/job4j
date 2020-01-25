package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void  whenArrayHas5Then0(){
        FindLoop findLoop = new FindLoop();
        int[] rst = new int[]{5,3,9,10,372};
        int resultIndex = findLoop.indexOf(rst, 9);
        assertThat(resultIndex,is(2));
    }

    @Test
    public void whenNotFind(){
        FindLoop findLoop = new FindLoop();
        int[] rst = new int[]{5,1,123,3,12,34};
        int resultIndex = findLoop.indexOf(rst, 539);
        assertThat(resultIndex,is(-1));
    }

    @Test
    public void whenFindInRange(){
        int[] in = new int[]{1,2,3,4,5,6,7,8,9};
        int resultIndex = FindLoop.indexOf(in, 4,0,3);
        assertThat(resultIndex, is(4));
    }

    @Test
    public void whenDidNotFindInRange(){
        int[] in = new int[]{1,2,3,4,5,6,7,8,9};
        int resultIndex = FindLoop.indexOf(in, 3,3,8);
        assertThat(resultIndex, is(-1));
    }

}
