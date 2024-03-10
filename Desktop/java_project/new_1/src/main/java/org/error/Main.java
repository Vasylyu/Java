package org.error;

/**
 * Реализуйте метод, принимающий в качестве аргументов целочисленный массив и некоторый допустимый минимум.
 * Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(checkArrayLength(new int[]{1,2,3}, 7));

    }
    public static int checkArrayLength(int[] arr, int min){
        if (arr.length < min)
            return -1;
        else return arr.length;

    }
}
