package org.error.Task03;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
//        System.out.println(divide(2, 0));
        try {
            fileNotFound("db");
        }catch (NonExistedFileException e){
            e.printStackTrace();
        }
    }

    public static double divide(int num1, int num2) {
        if (num2 == 0)
            throw new DivideByZeroException("random");
        return num1 / num2;
    }
    public static void fileNotFound(String path) throws NonExistedFileException{
        try {
            FileReader fr = new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new NonExistedFileException();
        }
    }
}
