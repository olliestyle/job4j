package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result1 = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result1);
        double result2 = distance(-2, -3, 2, 4);
        System.out.println("result (-2, -3) to (2, 4) " + result2);
        double result3 = distance(1, 1, 5, 6);
        System.out.println("result (1, 1) to (5, 6) " + result3);
        double result4 = distance(0, 100, 0, -200);
        System.out.println("result (0, 100) to (0, -200) " + result4);
    }
}
