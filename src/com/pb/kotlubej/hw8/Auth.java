package com.pb.kotlubej.hw8;

import com.pb.kotlubej.hw6.Cat;
import com.sun.org.apache.xpath.internal.functions.WrongNumberArgsException;

import java.util.Scanner;

public class Auth extends Exception {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Auth(String login, String password) {
        this.login = login;
        this.password = password;
     }
    public Auth()
    {}
    public void signUp(String login, String password, String confirmPassword) {
        try {
            if (login.matches("^[a-zA-Z0-9._-]{5,20}$"))
            {
                System.out.println("Успешный логин");
                this.login = login;
                try {
                    if (password.matches("^[a-zA-Z0-9._\\\\w-]{5,}$"))
                    {
                        System.out.println("Успешный пароль");
                        if (confirmPassword.equals(password))
                        {
                            System.out.println("Пароли совпадают");
                            this.password = password;
                            System.out.println("Регистрация успешная");
                        }
                        else
                        {
                            System.out.println("Пароли не совпадают");
                            System.exit(0);
                        }
                    }
                    else
                    {
                        throw new WrongPasswordException ("У Вас проблема...");
                    }

                } catch (WrongPasswordException e) {
                    System.out.println("Неверный пароль");
                    System.exit(0);
                };


            }
            else
            {
                throw new WrongLoginException ("У Вас проблема...");
            }

        } catch (WrongLoginException e) {
                System.out.println("Неправильный логин");
                System.exit(0);
            };


    }

    public void signIn(String login1, String password1) {
            if ((login1.equals(login))&&(password1.equals(password)))
            {
                System.out.println("Успешная регистрация");
            }
            else
            {
            System.out.println("Неправильный логин или пароль");
        }
    }
}






