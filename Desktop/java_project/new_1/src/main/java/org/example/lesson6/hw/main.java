/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
 * (произведение чисел от 1 до n)
 * n = 4 -> 10
 * n = 5 -> 15
 */
package org.example.lesson6.hw;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        int result = countNTriangle(n);
        System.out.printf("Triangle = %s ",result);
    }

      public static int countNTriangle(int n) {
          int Triangle = 0;

        if (n >= 1) {
            Triangle = n * (n + 1) / 2;
        }
        else  {
            Triangle = -1;

        }
        return Triangle;
    }
}
