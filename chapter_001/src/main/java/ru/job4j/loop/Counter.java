package ru.job4j.loop;

public class Counter {
    /**
     * Метод складывания чисел в заданном диапазоне
     * @param start
     * @param finish
     * @return
     */
    public int add(int start, int finish) {

        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
            sum = sum + i;
            }
        }

        return sum;
    }

}
