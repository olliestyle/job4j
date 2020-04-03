package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        Integer o1Number = Integer.valueOf(o1.substring(0, o1.indexOf(".")));
        Integer o2Number = Integer.valueOf(o2.substring(0, o2.indexOf(".")));
        return o1Number.compareTo(o2Number);
    }
}
