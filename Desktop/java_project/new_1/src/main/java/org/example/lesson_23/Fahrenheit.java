package org.example.lesson_23;

public class Fahrenheit extends Converter {
    /**
     *
     * @param value температура в Цельсиях
     * @return температура в Фаренгейтах
     */
    @Override
    public double convertValue(double value) {
        return (value * 1.8) + 32;
    }
}
