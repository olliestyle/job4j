package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void whenZero(){
        boolean rsl = CheckPrimeNumber.check(0);
        assertThat(rsl, is(false));
    }

    @Test
    public void when1(){
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }

    @Test
    public void when5(){
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4(){
        boolean rsl = CheckPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when3571(){
        boolean rsl = CheckPrimeNumber.check(3571);
        assertThat(rsl, is(true));
    }

    @Test
    public void when121(){
        boolean rsl = CheckPrimeNumber.check(121);
        assertThat(rsl, is(false));
    }

    @Test
    public void when81(){
        boolean rsl = CheckPrimeNumber.check(81);
        assertThat(rsl, is(false));
    }

    @Test
    public void when169(){
        boolean rsl = CheckPrimeNumber.check(169);
        assertThat(rsl, is(false));
    }
}
