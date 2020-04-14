package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int result = 0;
        int lengthOfMinArray = Math.min(o1.length(), o2.length());
        for (int i = 0; i < lengthOfMinArray; i++) {
            if (o1.charAt(i) == '/' || o2.charAt(i) == '/') {
                break;
            }
            result = Character.compare(o2.charAt(i), o1.charAt(i));
        }
        if (result == 0) {
            result = o1.compareTo(o2);
        }
        return result;
    }
}
