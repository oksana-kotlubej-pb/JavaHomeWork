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
                System.out.println("Мое число меньше. ");
            } else {
                System.out.println("Мое число больше. ");
            }
            counter++;
        } while (y != x);
        System.out.println("Количество попыток " + counter);
    }
}


