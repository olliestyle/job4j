package ru.job4j.streamapi;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static ru.job4j.streamapi.FilterObject.*;

public class FilterObjectTest {
    @Test
    public void testObject() {
        User user1 = new User("Akin", 30);
        User user2 = new User("Ben", 20);
        User user3 = new User("Bob", 17);
        List<User> list = List.of(user1, user2, user3);
        assertThat(FilterObject.filter(list).get(0).getName(), is("Ben"));
    }
}