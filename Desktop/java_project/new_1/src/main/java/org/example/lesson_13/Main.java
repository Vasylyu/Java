package org.example.lesson_13;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> integerList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            integerList.add(scanner.nextInt());
        }
        scanner.close();
        System.out.println("integerList.peek() = " + integerList.peek());
        System.out.println("integerList = " + integerList);
        System.out.println("integerList.pop() = " + integerList.pop());
        integerList.addLast(7);
        integerList.addFirst(8);
        integerList.remove(4);
        integerList.remove(4);
        integerList.set(3,6);
        System.out.println("integerList = " + integerList);
        System.out.println("integerList.indexOf(3) = " + integerList.indexOf(3));
        integerList.remove((Integer) 4);
        System.out.println("integerList.peek() = " + integerList.peek());
        System.out.println("integerList = " + integerList);
        System.out.println("integerList.pop() = " + integerList.pop());
        System.out.println("integerList = " + integerList);
        integerList.addLast(7);
        System.out.println("integerList = " + integerList);
        integerList.addFirst(8);
        System.out.println("integerList = " + integerList);
        integerList.set(3,100);
        System.out.println("integerList = " + integerList);
        System.out.println("integerList.contains(3) = " + integerList.contains(3));
        System.out.println(integerList.indexOf(3));
        integerList.remove((Integer) 4);
        System.out.println("integerList = " + integerList);
    }
}




