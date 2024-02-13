
/**
 * @param arr массив для проверки на симметричность
 * @return результат проверки
 * @apiNote Дан массив целых чисел.
 * Верно ли, что массив является симметричным.
 */
package org.example.lesson4;

import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол элементов ");
        int n = scanner.nextInt();
        int[] arr = new int[n];//todo: int [] arr = {1,2,3,4,5}; ввод
        System.out.println("ведите сами элементы ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        //todo блок обработки
        boolean f = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                f = false;
                break;
            }
        }
        System.out.println(f);
        for (int i = 0; i < arr.length; i++) {//todo вывод
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}