package org.example.lesson_14;

import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

/**
 * Построить однонаправленный список целых чисел.
 * Найти сумму четных элементов списка.
 */

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>(Arrays.asList(
                1, 2, 3, 4, 5));
        System.out.println("getSumEven(integerList) = " + getSumEven(integerList));
        System.out.println("getSumOdd(integerList) = " + getSumOdd(integerList));
        sumNoDivThree(integerList);
    }

    private static Integer getSumEven(List<Integer> integerList) {
        int sum = 0;
        for (Integer item : integerList) {
            if (isEven(item)) sum += item;
        }
        return sum;
    }

    private static Integer getSumOdd(List<Integer> integerList) {
        int sum = 0;
        for (Integer item : integerList) {
            if (!isEven(item)) sum += item;
        }
        return sum;
    }

    private static boolean isEven(Integer item) {
        return item % 2 == 0;
    }

    /**
     * Заменить некратные 3 элементы списка,
     * суммой нечетных элементов.
     */
    private static void sumNoDivThree(List<Integer> integerList) {
        int sum = 0;
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) % 3 != 0) {
                integerList.set(i, sum);
            }
        }
    }
}

