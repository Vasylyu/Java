package org.example.lesson_06.hw;


import java.util.Scanner;

/**
 * Напишите функцию printPrimeNums,
 * которая выведет на экран все простые числа в промежутке
 * от 1 до 1000, каждое на новой строке.
 */
public class main {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            int count = 0;
            for (int j = 2; j <= i && count < 2; j++) {
                if (i % j == 0) {
                    ++count;
                }
            }
            if (count < 2)
                System.out.println("i = " + i);
        }
    }
}




