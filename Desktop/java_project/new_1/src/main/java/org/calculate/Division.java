package org.calculate;

public class Division extends View {
    int div;

    public Division(Integer num1, Integer num2) {
        super(num1, num2);
    }

    public int getResult() {
        div = num1 / num2;
        if (num2 == 0)
            return -1;
         else {

        }
        return div;
    }
}