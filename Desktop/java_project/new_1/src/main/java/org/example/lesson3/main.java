
/**
 * @apiNote расширенное описание
 * @param n число
 * @return произв минус сумма
 * Дана строка.
 * Поменять местами ее половины.
 */
package org.example.lesson3;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1 = str.substring(0,str.length()/2);
        String str2 = str.substring(str.length()/2);
        System.out.println(str2 + str1);


    }
}
