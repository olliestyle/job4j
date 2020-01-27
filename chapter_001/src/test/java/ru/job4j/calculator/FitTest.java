package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {

        int in = 178; // определяем входные данные
        double expected = 89.7; // определяем ожидаемый результат от выполнения программы
        double out = Fit.manWeight(in); // сценарий действий
        Assert.assertEquals(expected, out, 0.01); // сравниваем ожидаемое и результатом
    }

    @Test
    public void womanWeight() {

        int in = 164;
        double expected = 62.1;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
