package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {

        int[] rsl = new int[left.length + right.length];

        int leftIndex = 0, rightIndex = 0;

//        if (left.length == 0) {
//            return right;
//        } else if (right.length == 0) {
//            return left;
//        }
        while (leftIndex + rightIndex < rsl.length) {
            if (leftIndex == left.length || left.length == 0) {
                //leftIndex--;
                while (leftIndex + rightIndex < rsl.length) {
                    rsl[leftIndex + rightIndex] = right[rightIndex];
                    rightIndex++;
                }
                return rsl;
            }
            if (rightIndex == right.length || right.length == 0) {
                //rightIndex--;
                while (leftIndex + rightIndex < rsl.length) {
                    rsl[leftIndex + rightIndex] = left[leftIndex];
                    leftIndex++;
                }
                return rsl;
            }
            rsl[leftIndex + rightIndex] = left[leftIndex] < right[rightIndex] ? left[leftIndex++] : right[rightIndex++];
        }
        return rsl;
    }

    public static void main(String[] args) {

        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }

}
