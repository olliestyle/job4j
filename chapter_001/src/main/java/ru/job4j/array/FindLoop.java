package ru.job4j.array;

public class FindLoop {
    /**
     * Метод поиска элемента в массиве
     * @param data
     * @param el
     * @return
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Метод поиска элемента в массиве в заданном диапазоне
     * @param data
     * @param elem
     * @param start
     * @param finish
     * @return
     */
    public static int indexOf(int[] data, int elem, int start, int finish) {
        int rst = -1;
        for (int i = start; i < finish; i++) {
            if (data[i] == elem) {
                rst = i;
            }
        }
        return rst;
    }
}
