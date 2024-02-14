package org.example.OOP_1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMacine implements VendingMachine {

    List<Product> hotDrinkList = new ArrayList<>();

    public void addHotDrink(HotDrink cup) {
        hotDrinkList.add(cup);
    }

    @Override
    public void initPriduct(List<Product> list) {

    }

    @Override
    public Product getProduct(String name) {
        for (Product product : hotDrinkList) {
            if (name.equals(product.getName())) {
                return product;
            }
        }
        return null;
    }

    public Product getProduct(String name, double volume, int temperature) {
        for (Product hotDrink : hotDrinkList) {
            if (hotDrink.getName().equals(name)
                    && ((HotDrink) hotDrink).getTemperature() == temperature
                    && ((BottleWater) hotDrink).getVolume() == volume)
                return hotDrink;
        }
        return null;
    }

}


