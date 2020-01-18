package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance(){
        //определяем входные данные
        int inX1 = 0;
        int inY1 = 100;
        int inX2 = 0;
        int inY2 = -200;
        //ожидаемый результат
        double expected = 300;
        //сценарий
        double out = Point.distance(inX1, inY1, inX2, inY2);
        //сравниваем ожидаемое с результатом
        Assert.assertEquals(expected, out, 0.01);
    }
}
