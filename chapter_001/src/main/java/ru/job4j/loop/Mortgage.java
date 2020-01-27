package ru.job4j.loop;

public class Mortgage {

    public int year(int amount, int salary, double percent) {

        int year = 0;
        int remains = 1;
        while (remains > 0) {
            remains = (int) (amount + amount * percent / 100 - salary);
            amount = remains;
            year++;
        }
        return year;
    }

}
