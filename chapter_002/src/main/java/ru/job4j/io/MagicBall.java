package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = 0;
        while (answer != 3) {
        System.out.println("Я великий Оракул. Что ты хочешь узнать?");
        input.nextLine();
        answer = new Random().nextInt(4);

            switch (answer) {
                case 0:
                    System.out.println("Да");
                    break;
                case 1:
                    System.out.println("Нет");
                    break;
                case 2:
                    System.out.println("Может быть");
                    break;
                default:
                    System.out.println("Ваше время вышло");
                    break;
            }
        }
    }
}
