package org.calculate;

public class Subtraction extends View {

    int sub;

    public Subtraction(Integer num1, Integer num2) {
        super(num1, num2);
    }

    public int getResult() {
        sub = num1 - num2;
        return sub;
    }
}