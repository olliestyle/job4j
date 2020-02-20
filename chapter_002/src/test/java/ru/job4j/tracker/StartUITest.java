package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StartUITest {

    /**
     * В StubInput input записываем ответ, который якобы считываем с клавиатуры.
     * Инициализиуруем StubAction action.
     * Передаем в качестве аргументов:
     * 1. input, который якобы введет "0" в консоль при вызове метода input.askInt в методе init
     * 2. new UserAction[] { action }, который будет указывать на объект StubAction под индексом "0"
     * После чего выполнится метод execute() объекта action класса StubAction и call присвоится true
     */
    @Test
    public void whenExit() {
        StubInput input = new StubInput(new String[] {"0"});
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[] { action });
        assertThat(action.isCall(), is(true));
    }
}
