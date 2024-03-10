package org.calculate;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Первая версия калькулятора");
        System.out.print("\nВведите знак  (+, -, *, /): ");
        Sign_selection signSelection = new Sign_selection(reader.next(), reader.nextInt(), reader.nextInt());
        System.out.println("Результат равен: ");
        System.out.println(signSelection.getResult());
        System.out.println("Вторая версия калькулятора");
        System.out.print("Введите сложение: ");
        Summ summ = new Summ(reader.nextInt(), reader.nextInt());
        System.out.println("сумма");
        System.out.println(summ.getResult());
        System.out.print("Введите вычитание: ");
        Subtraction subtraction = new Subtraction(reader.nextInt(), reader.nextInt());
        System.out.println("вычитание");
        System.out.println(subtraction.getResult());
        System.out.print("Введите произведение: ");
        Multiplying multiplying = new Multiplying(reader.nextInt(), reader.nextInt());
        System.out.println("умножение");
        System.out.println(multiplying.getResult());
        System.out.print("Введите деление: ");
        Division division = new Division(reader.nextInt(), reader.nextInt());
        System.out.println("деление");
        System.out.println(division.getResult());
    }
}


