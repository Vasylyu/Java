package org.example.lesson_006.hw;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        summ(scanner);
        minus(scanner);
        proiz(scanner);
        delen(scanner);

    }
    private static void summ(Scanner scanner) {
        System.out.println("Введите число 1: ");
        int a = scanner.nextInt();
        System.out.println("Введите число 2: ");
        int b = scanner.nextInt();
        float c = a + b;
        System.out.println(c);
    }
    private static void minus(Scanner scanner) {
        System.out.println("Введите число 1: ");
        int a = scanner.nextInt();
        System.out.println("Введите число 2: ");
        int b = scanner.nextInt();
        float c = a - b;
        System.out.println(c);
    }
    private static void proiz(Scanner scanner) {
        System.out.println("Введите число 1: ");
        int a = scanner.nextInt();
        System.out.println("Введите число 2: ");
        int b = scanner.nextInt();
        float c = a * b;
        System.out.println(c);
    }
    private static void delen(Scanner scanner) {
        System.out.println("Введите число 1: ");
        double a = scanner.nextInt();
        System.out.println("Введите число 2: ");
        double b = scanner.nextInt();
        double c = a / b;
        if (b == 0) {
            c = -1;

        }
        System.out.println(c);
    }
}

