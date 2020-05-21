package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    int i = 5;

    public void doSome(int x) {
        x = x * 2;
        System.out.println(x);
    }

    public void doSome(ListExample listExample) {
        System.out.println(listExample.i);
    }

    public static void main(String[] args) {
        int j = 3;
        ListExample listExample = new ListExample();
        listExample.doSome(j);
        System.out.println(j);
        listExample.doSome(listExample);
        System.out.println(listExample.i);
    }

}
