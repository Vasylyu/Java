package org.example.Phone_book;

import org.example.lesson_10.Item;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        Map<String, List<String>> mapBook = new HashMap<String, List<String>>();
        mapBook.put("Мария ", new ArrayList<>(Arrays.asList("892334667", "3456456")));
        mapBook.put("олег ", new ArrayList<>(Arrays.asList("892334667", "3456456")));
        mapBook.put("Петя ", new ArrayList<>(Arrays.asList("892334667", "3456456", "456456")));
        mapBook.put("света ", new ArrayList<>(Arrays.asList("892334667")));
        mapBook.put("Миша", new ArrayList<>(Arrays.asList("892334667")));


        Map<String, Integer> mapBook2 = new HashMap<>();
        mapBook2.put("Мария ", 3443367);
        mapBook2.put("Олег ", 3445658);
        mapBook2.put("Кристина ", 3425577);


    }

    /**
     * Set<String> keys = mapBook.keySet();
     * System.out.println("Ключи: " + keys);
     * ArrayList<Integer> values = new ArrayList<>(mapBook.values());
     * System.out.println("Значения: " + values);
     * ArrayList<Integer> value = new ArrayList<>(mapBook2.values());
     * System.out.println("Значения: " + value);
     * <p>
     * // showContcts(mapBook, mapBook2);
     */

    private static void showContcts(Map<String, Integer> mapBook, Map<String, Integer> mapBook2) {

        System.out.println("Список контактов мобильных! ");
        for (String k : mapBook.keySet()) {
            Integer s = mapBook.get(k);
            System.out.println(k + s);
        }
        System.out.println("Список контактов домашних! ");
        for (String k : mapBook2.keySet()) {
            Integer s = mapBook2.get(k);
            System.out.println(k + s);
        }
        /**
         Scanner scanner = new Scanner(System.in);
         String str = scanner.nextLine();

         List<String> keys = new ArrayList<String>(mapBook.keySet());
         for (int i = 0; i < keys.size(); i++) {
         String key = keys.get(i);
         // if (String key(i) = str);
         //Integer value = mapBook.get(key);
         }
         System.out.println("keys = " + keys);
         }
         */

    }
}













