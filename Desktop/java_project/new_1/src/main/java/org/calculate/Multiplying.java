package org.calculate;

public class Multiplying extends View {
    int multi;

    public Multiplying(Integer num1, Integer num2) {
        super(num1, num2);

    }
    public int getResult() {
        multi = num1 * num2;
        return multi;
    }
}