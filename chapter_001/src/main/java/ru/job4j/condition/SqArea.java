package ru.job4j.condition;

public class SqArea {
    /**
     * Метод вычисления площади прямоугольника
     * @param p
     * @param k
     * @return
     */
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double lL = h * k;
        double s = lL * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        double result2 = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
    }
}
