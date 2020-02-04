package ru.job4j.converter;

/**
 * Класс для конвертации валют
 */
public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int in = 210;
        int expected = 3;
        int euro = rubleToEuro(in);
        boolean passed = expected == euro;
        System.out.println("210 rubles are " + euro + " euro. Test result: " + passed);

        in = 240;
        expected = 4;
        int dollar = rubleToDollar(in);
        passed = expected == dollar;
        System.out.println("240 rubles are " + dollar + " dollar. Test result: " + passed);

        in = 5;
        expected = 350;
        int rubleFirst = euroToRuble(in);
        passed = expected == rubleFirst;
        System.out.println("5 euro are " + rubleFirst + " rubles. Test result: " + passed);

        in = 6;
        expected = 360;
        int rubleSecond = dollarToRuble(in);
        passed = expected == rubleSecond;
        System.out.println("6 dollars are " + rubleSecond + " rubles. Test result: " + passed);
    }

}
