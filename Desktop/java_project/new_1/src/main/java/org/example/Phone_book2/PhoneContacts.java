package org.example.Phone_book2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneContacts {
    Map<String, List<String>> mapBook = new HashMap<String, List<String>>();
    static List<String> groups = new ArrayList<>();

    public static void addGroup(String input) {
        System.out.println("Создать контакт (введите наименование и его номер или введите нет)?");
        groups.add(input);
    }

    public static void toStringList() {
        System.out.println(groups.toString());
    }
}


