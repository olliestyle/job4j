package ru.job4j.array;

public class Check {

    public boolean mono(boolean[] data) {

        boolean etalon = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] != etalon) {
                return false;
            }
        }
        return true;
    }
}
