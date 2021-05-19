package ru.job4j.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapStringToChars {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("22");
        list.add("333");
        List<Character> res = list.stream().flatMap(el -> el.chars().mapToObj(i -> (char) i)).collect(Collectors.toList());
        System.out.println(res);
    }
}
