package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static void main(String[] args) {
        System.out.println(fillGaps(Arrays.asList("k1/sk1/ssk1/sssk1", "k2/sk2/ssk2/sssk2")));
    }

    /**
     * Из каждого deps вытаскиваем подотдел, используя split("/")
     * После добавляем поэлементно в ХэшСет, чтобы не было повторов
     * @param deps
     * @return
     */
    public static List<String> fillGaps(List<String> deps) {
//        List<String> result = new ArrayList<>();
        HashSet<String> tmp = new HashSet<>();
        for (String value: deps) {
            String start = "";
            for (String el: value.split("/")) {
                tmp.add(start + el);
                start = start + el + "/";
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }
}
