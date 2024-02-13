package org.example.lesson_9;


public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0, 2.0, 3.0);
        Vector vector2 = new Vector(2.0, 1.0, 3.0);
        Vector vector3 = vector1.two_product(vector2);
        System.out.println("vector3 = " + vector3);
        System.out.println("vector1.scalar_product(vector2) = " + vector1.scalar_product(vector2));
        System.out.println(vector1);
        System.out.println(vector2);
        System.out.println("vector1.length() = " + vector1.length());
        System.out.println("vector1.cos(vector2) = " + vector1.cos(vector2));
        System.out.println("vector1.sum(vector2) = " + vector1.sum(vector2));
        System.out.println("vector1.difference(vector2) = " + vector1.difference(vector2));

    }
}
