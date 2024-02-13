package org.example.OOP_1;

import java.util.ArrayList;
import java.util.List;

public class BottleofWaterVendingMasineWater implements VendingMachine {
    List<Product> productlist = new ArrayList<>();

    public void addBottleofWatter(BottleWater bottle) {
        productlist.add(bottle);
    }


    @Override
    public void initPriduct(List<Product> list) {
        productlist = list;

    }

    @Override
    public Product getProduct(String name) {
        for (Product i : productlist) {
            if (i.getName().equals(name))
                return i;
        }
        return null;
    }
}

