package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;

public class FunctionRange {

    interface Function<D extends Number, D1 extends Number> {
        double calculate(int x);
    }

    List<Double> diapason(int start, int end, Function<Double, Double> func)
    {
        List<Double> list = new ArrayList<>();
        for(int i = start; i < end; i++) {
            list.add(func.calculate(i));
        }
        return list;
    }
}
//Зачем эти дженерики в интерфейсе, без них работает
//<Double, Double>
//<D extends Number, D1 extends Number>