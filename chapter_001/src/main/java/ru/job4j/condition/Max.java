package ru.job4j.condition;

public class Max {
    /**
     * Метод распознования, какое число больше left или right
     * @param left
     * @param right
     * @return
     */
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }
}
