package com.pb.kotlubej.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int array [];
        array = new int[10];
        System.out.println("Введите 10 элементов для массива ");
        Scanner scanner = new Scanner(System.in);
        for (int counter = 0; counter < 10; counter++) {
            array[counter] = scanner.nextInt();
        }
        String result = array.toString();
        System.out.println("Ваш массив: ");
        for (int counter1 = 0; counter1 < 10; counter1++) {
            System.out.print(" " + array[counter1]);
        }
        int sum = 0;
        for (int counter2 = 0; counter2 < 10; counter2++) {
            sum+=array[counter2];
        }
        System.out.println("\n");
        System.out.println("Сумма элементов массива равна " + sum);
        int positiv = 0;
        for (int counter = 0; counter < 10; counter++) {
            if (array[counter] > 0) {
            positiv++;
            }
        }
        System.out.println("Количество положительных элементов массива " + positiv);
        for (int counter3 = 9; counter3 >= 1; counter3--) {
            for (int counter4 = 0; counter4 < counter3; counter4++) {
                if (array[counter4]>array[counter4+1]) {
                    int temp = array[counter4];
                    array[counter4] = array[counter4+1];
                    array[counter4+1] = temp;
                }
            }
        }
        System.out.println("Ваш отсортированный массив: ");
        for (int counter1 = 0; counter1 < 10; counter1++) {
            System.out.print(" " + array[counter1]);
        }
    }

}
