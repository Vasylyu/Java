package org.example.lesson_21;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Найти пересечение двух множеств
 * Пример:
 * set1= [1,2,3,4]
 * set2= [3,5,6,7]
 * Вывод в консоль:
 * [3]
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5,7));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(7, 4, 5, 7, 8, 9));
        Set<Integer> set3 = new HashSet<>(set1);
        set3.retainAll(set2);
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
        System.out.println("set3 = " + set3);
    }
}

