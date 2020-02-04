package ru.job4j.array;

public class Square {
    /**
     * Метод генерации массива
     * @param bound
     * @return
     */
    public int[] generate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = (i + 1) * (i + 1);
        }
        return rst;
    }
}
