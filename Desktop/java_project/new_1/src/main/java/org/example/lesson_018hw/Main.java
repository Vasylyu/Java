package org.example.lesson_018hw;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Реализуйте метод, который принимает на вход целочисленный массив arr:
 * - Создаёт список ArrayList, заполненный числами из исходого массива arr.
 * - Сортирует список по возрастанию и выводит на экран.
 * - Находит минимальное значение в списке и выводит на экран - Minimum is {число} - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
 * - Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
 * Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:
 * Integer[] arr - массив целых чисел.
 * Пример.
 * Исходный массив:
 * 4, 2, 7, 5, 1, 3, 8, 6, 9
 * Результаты:
 * [1, 2, 3, 4, 5, 6, 7, 8, 9]
 * Minimum is 1
 * Maximum is 9
 */
public class Main {
    public static void main(String[] args) {
        Integer[] arr = {4, 2, 7, 5, 2, 3, 8, 6, 9};
        sorted(arr);
    }
    private static void sorted(Integer[] arr) {
        LinkedList<Integer> lst = new LinkedList<>(Arrays.asList(arr));
        Collections.sort(lst);
        System.out.println("lst = " + lst);
        int min = 1;
        int max = 0;
        for (Integer i : lst) {
            if (i <= min) min = i;
            if (i > max) max = i;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

}
