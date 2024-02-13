package org.example.lesson_10;

import java.util.ArrayList;
import java.util.Scanner;
//1. Даны сведения об экспортируемых товарах:
// указывается наименование товара,
// страна, экспортирующая товар,
// и объем поставляемой партии в штуках.
// Найти страны, которые экспортируют данный(введенный с кл-ы) товар, и общий объем его экспорта.
public class main {
    public static void main(String[] args) {
        Item item1 = new Item("logka", "ru", 10000);
        Item item2 = new Item("vilca", "ru", 10000);
        Item item3 = new Item("nog", "ru", 10000);
        Item item4 = new Item("vilca", "ru", 10000);
        Item item5 = new Item("nog", "ru", 10000);
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();

        ArrayList<String> country = new ArrayList<>();
        Integer sumVolume = 0;
        for (Item elem : itemList) {
            if (elem.getName().equals(search)) {
                sumVolume += elem.getVolume();
                country.add(elem.getCountry());
            }
        }
        System.out.println(sumVolume);
        System.out.println("country = " + country);
    }
}