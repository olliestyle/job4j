package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {

        //определяем входные данные
        int inP = 6;
        int inK = 2;
        //определяем ожидаемый результат
        double expected = 2;
        //сценарий
        double out = SqArea.square(inP, inK);
        //сравниваем ожидаемое с результатом
        Assert.assertEquals(expected, out, 0.01);

    }
}
