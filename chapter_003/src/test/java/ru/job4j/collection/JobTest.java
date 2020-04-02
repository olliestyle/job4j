package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import static org.hamcrest.Matchers.lessThan;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenAscSortByName() {
        List<Job> jobList = new ArrayList<>();
        jobList.add(new Job("CCC", 7));
        jobList.add(new Job("AAA", 9));
        jobList.add(new Job("BBB", 8));
        Collections.sort(jobList, new JobAscByName());
        List<Job> expected = new ArrayList<>();
        expected.add(new Job("AAA", 9));
        expected.add(new Job("BBB", 8));
        expected.add(new Job("CCC", 7));
        assertThat(jobList, is(expected));
    }

    @Test
    public void whenDescSortByName() {
        List<Job> jobList = new ArrayList<>();
        jobList.add(new Job("BBB", 8));
        jobList.add(new Job("CCC", 7));
        jobList.add(new Job("AAA", 9));
        Collections.sort(jobList, new JobDescByName());
        List<Job> expected = new ArrayList<>();
        expected.add(new Job("CCC", 7));
        expected.add(new Job("BBB", 8));
        expected.add(new Job("AAA", 9));
        assertThat(jobList, is(expected));
    }

    @Test
    public void whenAscByPriority() {
        List<Job> jobList = new ArrayList<>();
        jobList.add(new Job("AAA", 9));
        jobList.add(new Job("BBB", 8));
        jobList.add(new Job("CCC", 7));
        Collections.sort(jobList, new JobAscByPriority());
        List<Job> expected = new ArrayList<>();
        expected.add(new Job("CCC", 7));
        expected.add(new Job("BBB", 8));
        expected.add(new Job("AAA", 9));
        assertThat(jobList, is(expected));
    }

    @Test
    public void whenDescByPriority() {
        List<Job> jobList = new ArrayList<>();
        jobList.add(new Job("CCC", 7));
        jobList.add(new Job("BBB", 8));
        jobList.add(new Job("AAA", 9));
        Collections.sort(jobList, new JobDescByPriority());
        List<Job> expected = new ArrayList<>();
        expected.add(new Job("AAA", 9));
        expected.add(new Job("BBB", 8));
        expected.add(new Job("CCC", 7));
        assertThat(jobList, is(expected));
    }

    @Test
    public void whenAscByNameAndDescByPriority() {
        List<Job> jobList = new ArrayList<>();
        jobList.add(new Job("CCC", 7));
        jobList.add(new Job("BBB", 8));
        jobList.add(new Job("AAA", 1));
        jobList.add(new Job("AAA", 5));
        jobList.add(new Job("AAA", 9));
        Collections.sort(jobList, new JobAscByName().thenComparing(new JobDescByPriority()));
        List<Job> expected = new ArrayList<>();
        expected.add(new Job("AAA", 9));
        expected.add(new Job("AAA", 5));
        expected.add(new Job("AAA", 1));
        expected.add(new Job("BBB", 8));
        expected.add(new Job("CCC", 7));
        assertThat(jobList, is(expected));
    }

    @Test
    public void whenDescByNameAndAscByPriority() {
        List<Job> jobList = new ArrayList<>();
        jobList.add(new Job("AAA", 1));
        jobList.add(new Job("BBB", 8));
        jobList.add(new Job("AAA", 9));
        jobList.add(new Job("CCC", 7));
        jobList.add(new Job("AAA", 5));
        Collections.sort(jobList, new JobDescByName().thenComparing(new JobAscByPriority()));
        List<Job> expected = new ArrayList<>();
        expected.add(new Job("CCC", 7));
        expected.add(new Job("BBB", 8));
        expected.add(new Job("AAA", 1));
        expected.add(new Job("AAA", 5));
        expected.add(new Job("AAA", 9));
        assertThat(jobList, is(expected));
    }
}
