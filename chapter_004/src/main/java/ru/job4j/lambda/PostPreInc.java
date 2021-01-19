package ru.job4j.lambda;

public class PostPreInc {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; ++i) {
            System.out.print(i + " ");
        }
        int i = 0;
        int j = 0;
        System.out.println();
        System.out.println(i++);
        System.out.println(++j);

        int x = 0;
        while (x++ < 10) {
            System.out.print(x + " ");
        }
        System.out.println();
        int z = 0;
        while (++z < 10) {
            System.out.print(z + " ");
        }
        System.out.println();
        int a = 1, b = 2;
        int c;
        c = ++a * b;
        System.out.println(c);
    }
}
