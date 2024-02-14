package org.example.OOP_1;

public class HotDrink extends BottleWater {
    private int temperature;

    @Override
    public String toString() {
        return "HotDrink{" +
                "temperature=" + temperature +
                '}';
    }

    public HotDrink(String name, int cost, double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;

    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


}