package org.error;

/**
 * Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
 * Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения:
 * метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
 * и в каждой ячейке может лежать только значение 0 или 1. Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
 */
public class massiv_double {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 1, 0, 1},
                {0, 1, 1, 1, 1},
                {0, 1, 1, 0, 1},
                {0, 1, 1, 0, 1},
                {0, 1, 1, 0, 1},
        };
        System.out.println(findSumTwoDimentionalArray(arr));
    }

    public static int findSumTwoDimentionalArray(int[][] arr) {
        int height = arr.length;
        int sum = 0;
        for (int[] ints : arr) {
            if (ints.length != height)
                throw new RuntimeException("The array isn't squared");
            for (int anInt : ints) {
                if (anInt == 0 || anInt == 1) {
                    sum += anInt;
                } else {
                    throw new RuntimeException("Unnaccepteble value");
                }
            }
        }
        return sum;
    }
}
