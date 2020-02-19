package ru.job4j.strategy;

import java.util.StringJoiner;

public class Triangle implements Shape {
    @Override
    public String draw() {
        StringJoiner pic = new StringJoiner(System.lineSeparator());
        pic.add("   x   ");
        pic.add("  xxx  ");
        pic.add(" xxxxx ");
        pic.add("xxxxxxx");
        return pic.toString();
    }
}
