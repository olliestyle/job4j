package ru.job4j.collection;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {

    @Test
    public void whenMissed() {
        List<String> input = List.of("k1/sk1");
        List<String> expect = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortAsc(result);
        assertThat(result, is(expect));
    }

    @Test
    public void whenMissed2() {
        List<String> input = List.of("k1/sk1", "k1/sk1", "k1/sk1/ssk1", "k2/sk1");
        List<String> expect = List.of("k1", "k1/sk1", "k1/sk1/ssk1", "k2", "k2/sk1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortAsc(result);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = List.of("k1", "k1/sk1");
        List<String> expect = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortAsc(result);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortDesc() {
        List<String> input = List.of("k1/sk1/ssk1", "k2/sk1");
        List<String> expect = List.of("k2", "k2/sk1", "k1", "k1/sk1", "k1/sk1/ssk1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortDesc(result);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortDesc2() {
        List<String> input = List.of("k1/sk1/ssk1", "k1/sk1/ssk2", "k2/sk1");
        List<String> expect = List.of("k2", "k2/sk1", "k1", "k1/sk1", "k1/sk1/ssk1", "k1/sk1/ssk2");
        List<String> result = Departments.fillGaps(input);
        Departments.sortDesc(result);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortDesc3() {
        List<String> input = List.of("k1/sk1/ssk1", "k2/sk1/ssk1", "k3/sk1/ssk1", "k3/sk1/ssk2", "k3/sk2/ssk1");
        List<String> expect = List.of("k3", "k3/sk1", "k3/sk1/ssk1", "k3/sk1/ssk2", "k3/sk2", "k3/sk2/ssk1", "k2", "k2/sk1", "k2/sk1/ssk1", "k1", "k1/sk1", "k1/sk1/ssk1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortDesc(result);
        assertThat(result, is(expect));
    }
}
