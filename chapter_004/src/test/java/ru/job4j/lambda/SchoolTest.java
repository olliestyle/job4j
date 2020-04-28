package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    @Test
    public void whenTenA() {
        List<Student> input = Arrays.asList(new Student(0), new Student(10),
                new Student(20), new Student(30),
                new Student(40), new Student(50),
                new Student(60), new Student(70),
                new Student(80), new Student(90),
                new Student(100));
        List<Student> expected = Arrays.asList(new Student(70), new Student(80),
                new Student(90), new Student(100));
        List<Student> result = School.collect(input, student -> student.getScore() >= 70 && student.getScore() <= 100);
        assertThat(result, is(expected));
    }

    @Test
    public void whenTenB() {
        List<Student> input = Arrays.asList(new Student(0), new Student(10),
                new Student(20), new Student(30),
                new Student(40), new Student(50),
                new Student(60), new Student(70),
                new Student(80), new Student(90),
                new Student(100));
        List<Student> expected = Arrays.asList(new Student(50), new Student(60));
        List<Student> result = School.collect(input, student -> student.getScore() >= 50 && student.getScore() < 70);
        assertThat(result, is(expected));
    }

    @Test
    public void whenTenC() {
        List<Student> input = Arrays.asList(new Student(0), new Student(10),
                new Student(20), new Student(30),
                new Student(40), new Student(50),
                new Student(60), new Student(70),
                new Student(80), new Student(90),
                new Student(100));
        List<Student> expected = Arrays.asList(new Student(0), new Student(10),
                new Student(20), new Student(30), new Student(40));
        List<Student> result = School.collect(input, student -> student.getScore() >= 0 && student.getScore() < 50);
        assertThat(result, is(expected));
    }
}
