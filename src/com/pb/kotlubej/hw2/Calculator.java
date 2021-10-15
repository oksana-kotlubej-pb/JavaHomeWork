package com.pb.kotlubej.hw2;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        double operand1, operand2;
        char sign;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter first number:");
        operand1 = scanner.nextInt();
        System.out.println("Enter second number:");
        operand2 = scanner.nextInt();
        System.out.println("Enter an operator (+, -, *, /:");
        sign = scanner.next().charAt(0);
        scanner.close();
        double result = 0;

        switch (sign)
        {
            case '+':
                result = operand1 + operand2;
                break;

            case '-':
                result = operand1 - operand2;
                break;

            case '*':
                result = operand1 * operand2;
                break;

            case '/':
                if (operand2 == 0)
                {
                    System.out.println("Error");
                }
                else
                {
                    result = operand1 / operand2;
                }
                break;
            default:
                System.out.println("You have entered wrong sign");
                return;

        }
        System.out.println(result);
    }
}


