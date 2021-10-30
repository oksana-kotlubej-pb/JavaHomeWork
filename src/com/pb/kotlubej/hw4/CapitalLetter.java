package com.pb.kotlubej.hw4;
import com.sun.net.httpserver.Authenticator;

import javax.xml.transform.Result;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CapitalLetter {
        public static void main(String[] args) {
            // StringBuilder builder = new StringBuilder();
            String str = " ";
            System.out.println("Введите Вашу строку ");
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
            String [] words = str.split ("\\s*(\\s|,|!|\\.)\\s*");
            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
            }
            str = String.join(" ", words);
            System.out.println(str);
            }
        }

