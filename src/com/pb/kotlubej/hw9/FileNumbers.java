package com.pb.kotlubej.hw9;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Random;

public class FileNumbers {
    public static void main(String[] args) throws Exception {

        int[][] FileNumbers = new int[10][10];
        for (int i = 0; i < FileNumbers.length; i++)
        {
            for (int j = 0; j < FileNumbers.length; j++)
            {
               FileNumbers[i][j] = ((int)(Math.random() * 99 + 1));
               System.out.println(FileNumbers[i][j] + " ");
               Writer.write(FileNumbers[i][j]);
            }
        }
        try (Writer writer = new FileWriter( "numbers.txt")) {
            writer.write(FileNumbers [i][j]);
        }
    }
}