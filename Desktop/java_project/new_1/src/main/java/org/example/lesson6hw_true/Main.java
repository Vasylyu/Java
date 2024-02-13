package org.example.lesson6hw_true;

public class Main {
    public static void main(String[] args) {
        class Calculator {
            public double calculate(char op, int a, int b) {
                double result = 0;
                switch (op) {
                    case '+':
                        result = add(a, b);
                        break;
                    case '-':
                        result = minus(a, b);
                        break;
                    case '*':
                        result = mult(a, b);
                        break;
                    case '/':
                        result = divide(a, b);
                        break;
                }
                return result;
            }

            private double divide(int a, int b) {
                if (b != 0)
                    return (double) a / b;
                return -1;
            }

            private int mult(int a, int b) {
                return a * b;
            }

            private int minus(int a, int b) {
                return a - b;
            }

            private int add(int a, int b) {
                return a + b;
            }
        }

         class Printer {
            public static void main(String[] args) {
                int a = 0;
                char op = ' ';
                int b = 0;

                if (args.length == 0) {
                    a = 7;
                    op = '+';
                    b = 3;
                } else {
                    a = Integer.parseInt(args[0]);
                    op = args[1].charAt(0);
                    b = Integer.parseInt(args[2]);
                }

                if (op != '+' && op != '-' && op != '*' && op != '/') {
                    System.out.println("Некорректный оператор: " + op);
                    return;
                }

                Calculator calculator = new Calculator();
                double result = calculator.calculate(op, a, b);
                System.out.println(result);
            }
        }

    }
}
