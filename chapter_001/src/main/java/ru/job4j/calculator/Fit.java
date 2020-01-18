package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        return (height - 100)*1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110)*1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(178);
        System.out.print("Man 178 is ");
        System.out.printf("%.2f", man);
        System.out.println();
        double woman =  womanWeight(164);
        System.out.print("Woman 164 is ");
        System.out.printf("%.2f", woman);
        System.out.println();
    }

}
