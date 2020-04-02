package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int dotIndexO1 = 0;
        int dotIndexO2 = 0;
        while (o1.charAt(dotIndexO1) != '.') {
            dotIndexO1++;
        }
        while (o2.charAt(dotIndexO2) != '.') {
            dotIndexO2++;
        }
        Integer o1Number = Integer.valueOf(o1.substring(0, dotIndexO1));
        Integer o2Number = Integer.valueOf(o2.substring(0, dotIndexO2));

        return o1Number.compareTo(o2Number);
    }
}
