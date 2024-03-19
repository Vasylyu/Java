package org.error.Task04;

import java.util.List;

public class MyArrayDataException extends IllegalArgumentException {
    public MyArrayDataException(int i, int j) {
        super(String.format("In the cell [%s][%s] is not a number", i, j));
    }

    public MyArrayDataException(List<Point2d> points) {
        super(String.format("The value in the cells %s are not numbers", points));
    }
}