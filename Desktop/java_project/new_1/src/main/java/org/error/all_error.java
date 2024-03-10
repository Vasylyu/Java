package org.error;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
 * Метод должен пройтись по каждому элементу и проверить что он не равен null. Реализуйте следующую логику:
 * 1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
 * 2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
 */
public class all_error {
    public static void main(String[] args) {

        checkArray(new Integer[]{1, 2, 3, null,null,null});
        ;
    }

    public static void checkArray(Integer[] arr) {
        List<Integer> cash = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null)
                cash.add(i);

        }
        if (!cash.isEmpty()) {
            throw new RuntimeException(String.format("В ячейке с индексом %s встретился null%n", cash));
        } else {
            System.out.println("Null не встретились");
        }
    }
}