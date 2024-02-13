package org.example.lesson_20;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Дан массив чисел, посчитать процент уникальных чисел.
 * *процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 1, 3};
        extracted(arr);
    }

    /**
     * @param arr инт массив
     * @apiNote МЕтод расчитывает уникальные числа по формуле: уникальных чисел * 100 / общее количество чисел в массиве
     */
    private static void extracted(int[] arr) {
        Set<Integer> set = new HashSet<>(Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)));
        System.out.println(set);
        int unicProcent = set.size() * 100 / arr.length;
        System.out.println(unicProcent + "%");
    }
}

