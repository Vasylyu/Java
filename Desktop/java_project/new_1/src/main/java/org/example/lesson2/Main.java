/**
последовательность N целых чисел.
Найти количество положительных чисел,
после которых следует отрицательное число.
*/
package org.example.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int current = scanner.nextInt();

        for (int i = 0; i < n-1; i++) {
            int next = scanner.nextInt();
            if (current > 0 && next < 0) {
                count++;
            }
            current = next;
        }
        System.out.println(count);
        scanner.close();
    }
}

//private static int getCount(Scanner scanner, int n, int count) {
    //int currentNumber = scanner.nextInt();

    //for (int i = 0; i < n - 1; i++) {
        //int nextNumber = scanner.nextInt();
        //if (currentNumber > 0 && nextNumber < 0) {
            //count++;
     //   }
        //currentNumber = nextNumber;
  //  }
   // return count;
//}






