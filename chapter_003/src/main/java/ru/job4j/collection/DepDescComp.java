package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int result = Integer.compare(o1.length(), o2.length());
        int lengthOfMinArray = Math.min(o1.length(), o2.length());
        for (int i = 0; i < lengthOfMinArray; i++) {
             if (o1.charAt(i) > o2.charAt(i)) {
                result = -1;
                break;
            } else if (o1.charAt(i) < o2.charAt(i)) {
                 result = 1;
                 break;
             }
        }
        if (o1.contains("/") && o2.contains("/") && o1.substring(0, o1.indexOf("/")).equals(o2.substring(0, o2.indexOf("/")))) {
            result = o1.compareTo(o2);
        }
        return result;
    }
}
