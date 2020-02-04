package ru.job4j.condition;

public class Triangle {
    /**
     * Метод распознования сущестовования треугольника: если значение суммы двух сторон
     * больше значения третьей стороны по трем стороноам треугольника - значит такой треугольник существует
     * @param ab
     * @param ac
     * @param bc
     * @return
     */
    public static boolean exist(double ab, double ac, double bc) {
        boolean exist = false;
        if (ab + ac > bc && ab + bc > ac && ac + bc > ab) {
            exist = true;
        }
        return exist;
    }
}
