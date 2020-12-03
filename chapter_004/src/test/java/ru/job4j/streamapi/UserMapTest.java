package ru.job4j.streamapi;

import org.junit.Test;
import ru.job4j.streamapi.UserMap.User;

import java.util.Iterator;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class UserMapTest {
//    @Test
//    public void test() {
//        List<Integer> integerList = List.of(18, 20, 21, 30);
//        List<User> expect = List.of(new User(18), new User(20), new User(21), new User(30));
//        List<User> result = UserMap.map(integerList);
//        assertThat(result, is(expect));
//    }

    @Test
    public void test1() {
        List<Integer> ages = List.of(1, 2, 30, 123);
        List<UserMap.User> result = UserMap.map(ages);
        Iterator<User> iterator = result.iterator();
        assertEquals(1, iterator.next().getAge());
        assertEquals(2, iterator.next().getAge());
        assertEquals(30, iterator.next().getAge());
        assertEquals(123, iterator.next().getAge());
    }
}