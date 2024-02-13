package org.example.lesson_18;

import java.util.*;

/**
 * Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
 * В противном случае (false).
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 5, 7, 9));

        System.out.println(containsDouble(lst));
    }

    public static boolean containsDouble(List<Integer> lst) {
        Map<Integer, Integer> dubs = new HashMap<>();
        for (Integer i : lst) {
            if (!dubs.containsKey(i)) {
                dubs.put(i, 1);
            } else {
                return true;
            }
        }
        return false;
    }
}

