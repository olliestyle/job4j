package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenAreaIs5() {
        Point first = new Point(0, 0);
        Point second = new Point(2, 2);
        Point third = new Point(0, 5);
        Triangle triangle = new Triangle(first, second, third);
        double expected = 5;
        double result = triangle.area();
        assertThat(result, is(expected));
    }

    @Test
    public void whenTriangleDontExist() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 0);
        Point third = new Point(0, 0);
        Triangle triangle = new Triangle(first, second, third);
        double expected = -1;
        double result = triangle.area();
        assertThat(result, is(expected));
    }
}
