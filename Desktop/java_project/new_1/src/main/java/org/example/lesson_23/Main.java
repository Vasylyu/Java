package org.example.lesson_23;

/**
 * Напишите интерфейс Converter для конвертации из градусов по Цельсию в
 * Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод интерфейса,
 * для валидного перевода величин. Метод для конвертации назовите "convertValue".
 */
public class Main {
    public static void main(String[] args) {
        Converter converter = new Kelvin();
        System.out.println("cel.convertValue = " + converter.convertValue(1000));

    }
}
