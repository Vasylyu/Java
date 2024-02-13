package org.example.lesson_19hw;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Дан произвольный массив целых чисел. Создайте список ArrayList,
 * заполненный данными из этого массива.
 * Необходимо удалить из списка четные числа и вернуть результирующий.
 * Напишите свой код в методе removeEvenNumbers класса Answer.
 * Метод removeEvenNumbers принимает на вход один параметр:
 * Integer[] arr - список целых чисел, возвращает список ArrayList<Integer>
 * Примеры.
 * Исходный массив:
 * 1, 2, 3, 4, 5, 6, 7, 8, 9
 * Результат:
 * [1, 3, 5, 7, 9]
 * Исходный массив:
 * 2, 4, 6, 8
 * Результат:
 * []
 */
public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        LinkedList<Integer> lst = new LinkedList<>(Arrays.asList(arr));
        for (int i = 1; i <= arr.length-1; i++) {
            int count = 0;
            int b = 0;
            int c =0;
            if (arr[i] % 2 == 0) {
                count = i++;
                b = count -1;
                c = count - b;
            }
            System.out.println("count = " + count);
            System.out.println(lst);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
        }

    }

}




