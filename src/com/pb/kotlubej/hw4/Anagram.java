package com.pb.kotlubej.hw4;

import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
    static boolean areAnagram(char[] arr1, char[] arr2)
    {
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = " ";
        String str2 = " ";
        System.out.println("Введите Вашу первую строку ");
        Scanner scanner = new Scanner(System.in);
        str1 = scanner.nextLine();
        System.out.println("Введите Вашу вторую строку ");
        str2 = scanner.nextLine();
        String str_new1 = str1.replaceAll("\\s*(\\s|,|!|\\.)\\s*", "").toLowerCase();
        String str_new2 = str2.replaceAll("\\s*(\\s|,|!|\\.)\\s*", "").toLowerCase();
        char [] arr1 = str_new1.toCharArray();
        char [] arr2 = str_new2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (areAnagram (arr1, arr2)) {
            System.out.println("Строки являются анаграммой");
        }
        else System.out.println("Строки не являются анаграммой");
    }
}


