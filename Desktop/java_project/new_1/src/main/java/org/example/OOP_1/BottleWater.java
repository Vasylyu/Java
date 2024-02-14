package org.example.OOP_1;

import java.util.ArrayList;

public class BottleWater extends Product {
    private double volume;


    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


    @Override
    public String toString() {
        return "BottleWater{" +
                "volume=" + volume +
                '}';
    }

    public BottleWater(String name, int cost, double volume) {
        super(name, cost);
        this.volume = volume;

    }
}


