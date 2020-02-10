package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenNotFindById() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById("1874619823749");
        assertThat(result, is(nullValue()));
    }

    @Test
    public void whenAddNewItemsThenFindByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("myName");
        Item item2 = new Item("gudvin");
        Item item3 = new Item("myName");
        Item item4 = new Item("hello");
        Item item5 = new Item("myName");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item5);
        Item[] expected = new Item[3];
        expected[0] = item;
        expected[1] = item3;
        expected[2] = item5;
        Item[] result = tracker.findByName("myName");
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddThreeItemsThenFindAll() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] expected = new Item[3];
        expected[0] = item1;
        expected[1] = item2;
        expected[2] = item3;
        Item[] result = tracker.findAll();
        assertThat(result, is(expected));
    }
}
