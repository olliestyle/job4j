package ru.job4j.condition;

public class MultiMax {
    /**
     * Метод вычисления наибольшего числа из трех
     * @param first
     * @param second
     * @param third
     * @return
     */
    public int max(int first, int second, int third) {

        int firstResult = first > second ? first : second;
        int result = firstResult > third ? firstResult : third;

        return result;
    }

}
