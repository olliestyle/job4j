package ru.job4j.loop;

public class PrimeNumber {
    /**
     * Метод для вычисления общего количества содержащихся в диапазоне от 0 до finish простых чисел
     * @param finish
     * @return
     */
    public int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }

}
