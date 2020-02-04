package ru.job4j.condition;

public class TrgArea {
    /**
     * Метод вычисления площади треугольника
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
        double rs2 = TrgArea.area(3, 3, 3);
        System.out.println("area (3, 3, 3) = " + rs2);
        double rs3 = TrgArea.area(6, 5, 4);
        System.out.println("area (6, 5, 4) = " + rs3);
        double rs4 = TrgArea.area(7, 8, 9);
        System.out.println("area (7, 8, 9) = " + rs4);
    }

}
