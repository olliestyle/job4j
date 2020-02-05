package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        Point first = new Point(0, 100);
        Point second = new Point(0, -200);
        //ожидаемый результат
        double expected = 300;
        //сценарий
        double out = first.distance(second);
        //сравниваем ожидаемое с результатом
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        Point first = new Point(0, -2, -1);
        Point second = new Point(3, 4, 5);
        double expected = 9;
        double out = first.distance3d(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}
