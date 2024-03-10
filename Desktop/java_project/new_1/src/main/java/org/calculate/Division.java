package org.calculate;

public class Division extends View {
    int div;

    public Division(Integer num1, Integer num2) {
        super(num1, num2);
    }

    public int getResult() {

        try {
            div = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("деление на ноль");
        }
        return div;
    }
}