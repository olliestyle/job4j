package ru.job4j.condition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second && first > third) {
                if (first > forth) {
                    result = first; // error - was result = third;
                }
        } else if (second > third) {
            if (second > forth) {
                result = second; // error - was result = first;
            }
        } else if (third > forth) {
            result = third; // error - was result = second;
        }
        return result;
    }
}
