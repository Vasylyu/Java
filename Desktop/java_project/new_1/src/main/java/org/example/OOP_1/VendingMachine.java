package org.example.OOP_1;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachine{

    public void initPriduct(List<Product>list);
    Product getProduct(String name);
}
