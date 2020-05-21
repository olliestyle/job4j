package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 333", 120),
                new Attachment("image 22", 23)
        };
        Comparator<Attachment> comparator = (left, right) -> left.getSize() - right.getSize();
        Arrays.sort(atts, comparator);
        for (Attachment a : atts) {
            System.out.println(a);
        }

        String[] strings = new String[3];
        strings[0] = "333";
        strings[1] = "1111";
        strings[2] = "22";



        Comparator<String> cmpSize = (left, right) ->  left.length() - right.length();
        Arrays.sort(strings, cmpSize);
        System.out.println("cmpSize");
        for (String a : strings) {
            System.out.println(a);
        }
        Comparator<String> cmpText = (left, right) -> left.compareTo(right);
        Arrays.sort(strings, cmpText);
        System.out.println("cmpText");
        for (String a : strings) {
            System.out.println(a);
        }
        Comparator<String> cmpDescSize = (left, right) -> right.compareTo(left);
        Arrays.sort(strings, cmpDescSize);
        System.out.println("cmpDescSize");
        for (String a : strings) {
            System.out.println(a);
        }
    }
}
