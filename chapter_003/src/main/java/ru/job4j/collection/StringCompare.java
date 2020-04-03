package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int result = Integer.compare(o1.length(), o2.length());
        int lengthOfMinArray = Math.min(o1.length(), o2.length());
        for (int i = 0; i < lengthOfMinArray; i++) {
            if (o1.charAt(i) != o2.charAt(i)) {
               result = Character.compare(o1.charAt(i), o2.charAt(i));
            }
        }
        return result;
    }
}
