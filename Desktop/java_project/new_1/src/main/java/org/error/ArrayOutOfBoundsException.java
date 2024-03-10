package org.error;

import java.util.Scanner;

public class ArrayOutOfBoundsException {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter number");
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            i = reader.nextInt();
            if (i == array.length) {
                System.out.println("Ты молодец попал в массив");
            }
            else {
                System.out.println("Выход за пределы массива");
            }
        }
    }
}

