package org.example.OOP_1;

import java.util.List;

/**
 * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
 * содержащий в себе методы initProducts (List <Product>)
 * сохраняющий в себе список исходных продуктов и getProduct(String name)
 * <p>
 * Реализовать конструкторы, get/set методы,
 * построить логику ТорговогоАвтомата на основе кода сделанного в задании 1.2
 * <p>
 * Сделать класс Товар абстрактным,
 * создать нескольких наследников (к примеру: БутылкаВоды),
 * сделать интерфейсом ТорговыйАвтомат и реализовать класс
 * какого-то одного типа ТорговогоАвтомата
 * (пример: ПродающийБутылкиВодыАвтомат
 */
public class Main {
    public static void main(String[] args) {
        BottleofWaterVendingMasineWater machine = new BottleofWaterVendingMasineWater();
        machine.addBottleofWatter(new BottleWater("Вода1", 100, 5));
        machine.addBottleofWatter(new BottleWater("Вода2", 10, 0.5));
        machine.addBottleofWatter(new BottleWater("Вода3", 1, 1));
        machine.addBottleofWatter(new BottleWater("Вода4", 1000, 500));

        HotDrinkVendingMacine cofe = new HotDrinkVendingMacine();
        cofe.addHotDrink(new HotDrink("чай", 24, 0.5, 86));
        cofe.addHotDrink(new HotDrink("кофе", 34, 0.5, 89));
        cofe.addHotDrink(new HotDrink("водка", 64, 0.5, 100));

        System.out.println(cofe.getProduct("кофе"));
        System.out.println(cofe.getProduct("водка"));

        System.out.println(machine.getProduct("Вода2"));
        printGetProduct(machine);
    }

    public static void printGetProduct(VendingMachine vendingMachine) {
        System.out.println(vendingMachine.getProduct("Вода4"));

    }

}