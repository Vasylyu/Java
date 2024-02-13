/**
 * @apiNote расширенное описание
 * @param n число
 * @return произв минус сумма
 */
package org.example.lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int result = resultPrMinusSum(n);
            System.out.printf("pr-sum = %s tak?",result);
        }

        public static int resultPrMinusSum(int n){
            int pr = 1;
            int sum = 0;
            while(n!=0){
                pr *= n % 10;
                sum += n % 10;
                n/=10;
            }
            return pr-sum;
        }
    }


