package org.control_work;

public class Gender extends Exception{
    public Gender() {
    }

    public void gender(String i) {
        System.out.println("Exception: Пол указан не верно");
        System.out.printf("It`s not correct data: %s", i);
        System.out.println();
    }
}
