package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc){
        boolean exist = false;
        if (ab + ac > bc && ab + bc > ac && ac + bc > ab){
            exist = true;
        }
        return exist;
    }
}
