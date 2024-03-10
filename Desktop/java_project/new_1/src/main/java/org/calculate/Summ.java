package org.calculate;
import java.util.Scanner;
public class Summ extends View {


    int summa;
    public Summ(Integer num1, Integer num2) {
        super(num1, num2);
    }
    public int getResult() {
       summa = num1 + num2;
        return summa;
    }
}



