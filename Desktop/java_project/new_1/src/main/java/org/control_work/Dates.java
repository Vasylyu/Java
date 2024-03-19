package org.control_work;

public class Dates extends Exception {
    public Dates() {
    }
    public void dates(String i) {
        System.out.println("Exception: Ввели неверно дату рождения");
        System.out.printf("It`s not correct date format: %s", i);
        System.out.println();
    }

}
