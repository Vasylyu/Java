package org.error.Task04;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    public MyArraySizeException() {
        super("Array index out of bounds");
    }
}