package org.calculate;

public class Sign_selection extends View {

    String op;
    int result;

    public Sign_selection(String op,Integer num1, Integer num2) {
        super(num1,num2);
        this.op = op;
    }
    public int getResult() {
        switch (op) {

            case "+":
                result = num1 +num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                try {
                    result = num1 / num2;
                } catch (ArithmeticException e) {
                    System.out.println("деление на ноль");
                }

                break;
            default:
                System.out.printf("ошибка! введите корректный знак ");

        }
        return result;
    }
}

