package org.example.lesson_009;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.*;

/**
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 * Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:
 * int[] arr - числовой массив
 * После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt' в формате год-месяц-день час:минуты {массив на данной итерации}.
 * Для логирования использовать логгер logger класса BubbleSort.
 * Пример
 * arr = new int[]{9, 4, 8, 3, 1};
 * sort(arr)
 * // При чтении лог-файла получим:
 * 2023-05-19 07:53 [4, 8, 3, 1, 9]
 * 2023-05-19 07:53 [4, 3, 1, 8, 9]
 * 2023-05-19 07:53 [3, 1, 4, 8, 9]
 * 2023-05-19 07:53 [1, 3, 4, 8, 9]
 * 2023-05-19 07:53 [1, 3, 4, 8, 9]
 */

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = {9, 4, 8, 3, 1};
        for (int i = arr.length - 1; i >= 1; i--) {
            int[] arr2 = arr.clone();
            for (int j = 0; j < i; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int shift = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = shift;
                }
            }
            arr = arr2.clone();
            Logger logger = Logger.getLogger(Main.class.getName());
            FileHandler fh = new FileHandler("log.txt");
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.info(Arrays.toString(arr));
        }
    }
}