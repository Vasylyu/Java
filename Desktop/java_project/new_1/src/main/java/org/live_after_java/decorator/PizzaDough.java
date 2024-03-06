package org.live_after_java.decorator;

public class PizzaDough implements Pizza{
    @Override
    public double getCost() {
        return 150;
    }

    @Override
    public String getDescription() {
        return "Тесто,";
    }
}
