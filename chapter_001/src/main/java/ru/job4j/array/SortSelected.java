package ru.job4j.array;

public class SortSelected {
    /**
     * Сортировки массива методом вставки
     * @param data
     * @return
     */
    public static int[] sort(int[] data) {

        for (int i = 0; i < data.length; i++) {
            int temp = data[i];
            data[i] = MinRange.findMin(data, i, data.length);
            data[FindLoop.indexOf(data, data[i], i, data.length)] = temp;
        }

        return data;
    }
}
