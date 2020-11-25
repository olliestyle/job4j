package ru.job4j.streamapi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Даны вложенные итераторы. Нужно написать метод, который соберет все элементы их итераторов в List.
 */
public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        ArrayList<Integer> res = new ArrayList<>();
        while (it.hasNext()) {
            it.forEachRemaining(n -> n.forEachRemaining(l -> res.add(l)));
        }
        return res;
    }
}
