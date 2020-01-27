package ru.job4j.array;

public class Defragment {

    public static String[] compress(String[] array) {

        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                while (point < array.length - 1 && array[point] == null) {
                        point++;
                }
                array[index] = array[point];
                array[point] = null;
            }
            System.out.println(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {null, null, "I", null, "wanna", null, "be", null, "compressed", null, null, "but", null, null, "not", null, "now"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
