package com.pb.kotlubej.hw8;
import com.pb.kotlubej.hw8.Auth;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        String login = " ";
        System.out.println("Просим провести регистрацию. Определите Ваш логин: ");
        Scanner scanner = new Scanner(System.in);
        login = scanner.nextLine();
        String password = " ";
        System.out.println("Определите Ваш пароль: ");
        password = scanner.nextLine();
        String confirmPassword = " ";
        System.out.println("Подтвердите пароль: ");
        confirmPassword = scanner.nextLine();
        Auth authorization = new Auth();
        authorization.signUp(login, password, confirmPassword);
        System.out.println("Просим провести авторизацию. Введите Ваш логин: ");
        String login1 = " ";
        login1 = scanner.nextLine();
        String password1 = " ";
        System.out.println("Введите Ваш пароль: ");
        password1 = scanner.nextLine();
        authorization.signIn(login1, password1);
    };
}
