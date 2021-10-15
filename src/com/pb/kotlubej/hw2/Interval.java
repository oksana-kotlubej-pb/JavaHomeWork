package com.pb.kotlubej.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        number = scanner.nextInt();
        scanner.close();
        if (number >= 0 && number <= 100)
        {
            if (number >= 0 && number <= 14) {
                System.out.println("Your interval is [0-14]");
            } else {
                if (number >= 15 && number <= 35) {
                    System.out.println("Your interval is [15-35]");
                } else {
                    if (number >= 36 && number <= 50) {
                        System.out.println("Your interval is [36-50]");
                    } else {
                        if (number >= 51 && number <= 100) {
                            System.out.println("Your interval is [51-100]");
                        }
                    }
                }
            }
        }
        else {
            System.out.println("Error, you entered the wrong number");
        }
    }
}