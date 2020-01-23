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

}
