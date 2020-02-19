package ru.job4j.strategy;

import java.util.StringJoiner;

public class Square implements Shape {
    @Override
    public String draw() {
        StringJoiner pic = new StringJoiner(System.lineSeparator());
        pic.add("xxxx");
        pic.add("x  x");
        pic.add("x  x");
        pic.add("xxxx");
        return pic.toString();
    }
}
