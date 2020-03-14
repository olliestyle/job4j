package ru.job4j.search;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDesk(), is("urgent"));
    }

    @Test
    public void whenHigherPriority2() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("very urgent", 1));
        queue.put(new Task("middle4", 4));
        queue.put(new Task("middle2", 2));
        queue.put(new Task("middle3", 3));
        queue.put(new Task("very low", 7));
        Task result = queue.take();
        assertThat(result.getDesk(), is("very urgent"));
    }

}
