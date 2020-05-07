package ru.job4j.lambda;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {

    List<Student> input;

    @Before
    public void init() {
        input = Arrays.asList(new Student(0), new Student(10),
                new Student(20), new Student(30),
                new Student(40), new Student(50),
                new Student(60), new Student(70),
                new Student(80), new Student(90),
                new Student(100));
    }

    @Test
    public void collectToMap() {
        Map<Integer, Student> expected = new HashMap<>();
        expected.put(0, new Student(0));
        expected.put(10, new Student(10));
        expected.put(20, new Student(20));
        expected.put(30, new Student(30));
        expected.put(40, new Student(40));
        expected.put(50, new Student(50));
        expected.put(60, new Student(60));
        expected.put(70, new Student(70));
        expected.put(80, new Student(80));
        expected.put(90, new Student(90));
        expected.put(100, new Student(100));
        Map<Integer, Student> result = input.stream().distinct().collect(Collectors.toMap(Student::getScore, student -> student));
        assertThat(result, is(expected));
    }

    @Test
    public void whenTenA() {
        List<Student> expected = Arrays.asList(new Student(70), new Student(80),
                new Student(90), new Student(100));
        List<Student> result = School.collect(input, student -> student.getScore() >= 70 && student.getScore() <= 100);
        assertThat(result, is(expected));
    }

    @Test
    public void whenTenB() {
        List<Student> expected = Arrays.asList(new Student(50), new Student(60));
        List<Student> result = School.collect(input, student -> student.getScore() >= 50 && student.getScore() < 70);
        assertThat(result, is(expected));
    }

    @Test
    public void whenTenC() {
        List<Student> expected = Arrays.asList(new Student(0), new Student(10),
                new Student(20), new Student(30), new Student(40));
        List<Student> result = School.collect(input, student -> student.getScore() >= 0 && student.getScore() < 50);
        assertThat(result, is(expected));
    }
}
