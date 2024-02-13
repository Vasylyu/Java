package org.example.lesson_18hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] a = {5, 1, 6, 2, 3, 4};
        mergeSort(a);
    }
    private static void mergeSort(int[] a) {
        int n = 6;
        int mid = n / 2;
        int left = 0;
        int right = 0;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        for (int value : a) {
            System.out.println("value = " + value);
        }
        int[] c = mergeArrays(l, r);

        for (int value : c) {
            System.out.println("new = " + value);
        }
    }
    private static int[] mergeArrays(int[] l, int[] r) {
        int[] c = new int[l.length + r.length];
        int i = 0, i1 = 0, i2 = 0;

        while (i1 < l.length && i2 < r.length) c[i++] = l[i1] < r[i2] ? l[i1++] : r[i2++];
        while (i1 < l.length) c[i++] = l[i1++];
        while (i2 < r.length) c[i++] = r[i2++];
        return c;
    }
}


        




