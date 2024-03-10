package org.error;

import java.util.Scanner;

public class DivisionByZero {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("enter number 1: ");
        int a = reader.nextInt();
        System.out.println("enter number 2: ");
        int b = reader.nextInt();
        int c = 0;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("division by zero");

        }
        System.out.println(c);
    }

}

