package org.example.lesson_23;

public class Kelvin extends Converter{
    /**
     *
     * @param value температура в Цельсиях
     * @return температура в Кельвинах
     */
    @Override
    double convertValue(double value) {
        return value + 273.15;
    }
}
