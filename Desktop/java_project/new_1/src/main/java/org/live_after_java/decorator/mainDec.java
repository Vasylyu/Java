package org.live_after_java.decorator;

public class mainDec {
    public static void main(String[] args) {
        Pizza pizza = new CheeseDecorator(new CheeseDecorator(new PeperoniDecorator(new PeperoniDecorator(new PeperoniDecorator(new PizzaDough())))));
        printPizza(pizza);

    }

    static void printPizza(Pizza pizza) {
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
