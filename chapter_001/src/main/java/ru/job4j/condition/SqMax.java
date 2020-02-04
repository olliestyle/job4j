package ru.job4j.condition;

public class SqMax {
    /**
     * Метод вычисления наибольшего числа из четырех
     * @param first
     * @param second
     * @param third
     * @param forth
     * @return
     */
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second && first > third) {
                if (first > forth) {
                    result = first;
                }
        } else if (second > third) {
            if (second > forth) {
                result = second;
            }
        } else if (third > forth) {
            result = third;
        }
        return result;
    }
}
