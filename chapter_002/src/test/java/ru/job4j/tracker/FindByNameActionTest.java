package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindByNameActionTest {
    @Test
    public void whenCheckOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Store memTracker = new MemTracker();
        Item item = new Item("Hello");
        memTracker.add(item);
        FindByNameAction action = new FindByNameAction();
        action.execute(new StubInput(new String[]{item.getName()}), memTracker);
        String expect = "List of items that was found: " + new StringJoiner("")
                .add(System.lineSeparator())
                .add("" + item.getId() + " " + item.getName())
                .add(System.lineSeparator())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
}
