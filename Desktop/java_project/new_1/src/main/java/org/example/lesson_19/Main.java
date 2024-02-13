package org.example.lesson_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * <p>
 * 1)	ввод: s = "LVIII"
 * вывод: 58
 * разбор: L = 50, V= 5, III = 3.
 */
public class Main {
    public static void main(String[] args) {

        String str = "LVIII";

        System.out.println(getArabNumber(str));
        System.out.println("getArabNumber( s = \"MCMXCIV\") = " + getArabNumber(  "MCMXCIV"));

    }
    private static Integer getArabNumber(String str) {
        Map<Character, Integer> numbers = new HashMap<>(Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        ));
        Integer summ = numbers.get(str.charAt(str.length()-1));
        for (int i = 0; i < str.length() -1; i++) {
            if (numbers.get(str.charAt(i)) < numbers.get(str.charAt(i + 1))) {
                summ -= numbers.get(str.charAt(i));
            }else{
                summ += numbers.get(str.charAt(i));
            }
        }
        return summ;
    }
}
