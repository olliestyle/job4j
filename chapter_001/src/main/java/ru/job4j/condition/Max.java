package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        int firstResult = max(first, second);
        int result = max(firstResult, third);
        return result;
    }

    public static int max(int first, int second, int third, int forth) {

        if(forth > max(first, second, third)) {
            return forth;
        } else if(third > max(first, second, forth)) {
            return third;
        } else if(second > max(first, third, forth)) {
            return second;
        } else {
            return first;
        }
    }
}
