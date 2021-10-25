package com.pb.kotlubej.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(101);
        System.out.println("Я загадала число от 0 до 100, отгадайте его ");
        System.out.println("Введите Ваше число ");

        int y, counter = 0;
        do {
            Scanner scanner = new Scanner(System.in);
        y = scanner.nextInt();
        if (y == x) {
                System.out.println("Вы угадали! ");
        break;
        }
            if (x < y) {
                System.out.println("Мое число меньше. Для продолжения игры введите новое число. Для окончания игры введите 1000  ");
            } else {
                System.out.println("Мое число больше. Для продолжения игры введите новое число. Для окончания игры введите 1000  ");
            }
            if (y == 1000) {
                System.out.println("Игра окончена, Вы не угадали");
                break;
            }
            counter++;
        } while (y != x);
        System.out.println("Количество попыток " + counter);
    }
}


