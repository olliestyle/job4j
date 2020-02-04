package ru.job4j.loop;

public class Fitness {
    /**
     * Метод для вычисления необходимого количества месяцев для улучшения результата подъема штанги
     * @param ivan
     * @param nik
     * @return
     */
    public int calc(int ivan, int nik) {
        int month = 0;

        while (ivan < nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }

        return month;
    }

}
