package ru.job4j.lambda;

import java.util.*;
import java.util.stream.Collectors;

public class SortEx {

    public SortEx() {
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for(int i = 1000; i > 0; i--) {
            list.add(i);
        }
//        System.out.println(list);
        SortEx sortEx = new SortEx();
        sortEx.sortIntByCycle(list);
//        sortEx.sortIntbyStream(list);
//        System.out.println(list);
        System.out.println("Hello");

    }

    public List<Integer> sortIntByCycle(List<Integer> toSortList) {
        Collections.sort(toSortList);
        return toSortList;
    }

    public List<Integer> sortIntbyStream(List<Integer> toSortList) {
        return toSortList.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }

}
