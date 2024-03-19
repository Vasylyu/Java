package org.control_work;

public class Data extends Exception {
    public Data() {
    }

    public void data(String i) {
        System.out.println("Exception: Ввели неверно данные");
        System.out.printf("It`s not correct format: %s", i);
        System.out.println();
    }

}