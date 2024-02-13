package org.example.Phone_book2;

import java.util.*;



public class Main {
    public static void main(String[] args) {

        Map<String, List<String>> mapBook = new HashMap<String, List<String>>();
        mapBook.put("Мария ", new ArrayList<>(Arrays.asList("892334667", "3456456")));
        mapBook.put("олег ", new ArrayList<>(Arrays.asList("892334667", "3456456")));
        mapBook.put("Петя ", new ArrayList<>(Arrays.asList("892334667", "3456456", "456456")));
        mapBook.put("света ", new ArrayList<>(Arrays.asList("892334667")));
        mapBook.put("Миша", new ArrayList<>(Arrays.asList("892334667")));

        System.out.println("Список контактов мобильных! ");
        for (String k : mapBook.keySet()) {
            List s = mapBook.get(k);
            System.out.println(k + s);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа справочник" +
                "\nВведите название группы контактов:");

        while (true) {
            String input = scanner.nextLine();
            if ("нет".equals(input)) break;
            PhoneContacts.addGroup(input);

        }

        PhoneContacts.toStringList();

    }


        }

    }

