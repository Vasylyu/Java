package org.error;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  скорректируйте код
 * обоснуйте свое решение.
 */
public class Task1 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println(
                "Укажите индекс элемента массива, " +
                        "в который хотите записать значение 1");
        int index = 0;

        if (scanner.hasNextInt()) {
            index = scanner.nextInt();
        } else {
            System.out.println("Error");
        }

        try {
            arr[index] = 1;
        }
        //catch (InputMismatchException e){
         //   e.printStackTrace();
      //  }
        catch (IndexOutOfBoundsException e) {
            System.err.println("Указан индекс за пределами массива");
        }
    }
}

