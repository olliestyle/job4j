package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру 11");
        System.out.println("Сейчас на столе лежат 11 спичек");
        System.out.println("Два игрока берут по очереди от 1 до 3 спичек");
        System.out.println("Выигрывает тот, кто забрал последние спички");
        char exit = 'y';
        while (exit != 'n') {
                    int countMatches = 11, countMatchesToPull = 0;
                    int player = 1;
                    while (countMatches != 0) {
                        System.out.println("Игрок " + player + " , Ваш ход! Сколько спичек Вы хотите вытянуть?");
                        countMatchesToPull = Integer.valueOf(input.nextLine());
                        countMatches -= countMatchesToPull;
                            if (countMatchesToPull < 1 || countMatchesToPull > 3) {
                                System.out.println("Нельзя брать " + countMatchesToPull + " спичек!");
                                System.out.println("Возьмите от 1 до 3 спичек!");
                                countMatches += countMatchesToPull;
                                continue;
                            }
                        if (countMatches < 0) {
                            countMatches += countMatchesToPull;
                            System.out.println("На столе меньше спичек, чем Вы хотите взять!!!");
                            System.out.println("Попробуйте еще раз");
                            continue;
                        } else {
                            System.out.println("Игрок " + player + " вытянул " + countMatchesToPull + " спичек");
                            System.out.println("На столе осталось " + countMatches + " спичек");
                            if (countMatches == 0) {
                                System.out.println("Игрок " + player + " выиграл!");
                                System.out.println("Хотите сыграть еще раз? y/n?");
                                exit = Character.valueOf(input.nextLine().toCharArray()[0]);
                                continue;
                            }
                            if (player == 1) {
                                player++;
                            } else if (player == 2) {
                                player--;
                            }
                        }
            }
        }
        System.out.println("Всего хорошего! Возвращайтесь скорее!");
    }
}
