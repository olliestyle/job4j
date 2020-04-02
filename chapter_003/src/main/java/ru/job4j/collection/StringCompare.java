package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        char[] o1Array = o1.toCharArray();
        char[] o2Array = o2.toCharArray();
        int lengthOfMinArray = Math.min(o1Array.length, o2Array.length);
        for (int index = 0; index < lengthOfMinArray; index++) {
            if (o1Array[index] > o2Array[index]) {
                return 1;
            } else if (o1Array[index] < o2Array[index]) {
                return -1;
            } else if (index == lengthOfMinArray - 1) {
                return o1Array.length > o2Array.length ? 1 : o1Array.length < o2Array.length ? -1 : 0;
            }
        }
        return 0;
    }
}
