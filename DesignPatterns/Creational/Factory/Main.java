package org.example.DesignPatterns.Creational.Factory;

/*
* When object creation is complex.

When we want to hide creation logic from the client*/
public class Main {
    public static void main(String[] args)
    {
        Pizza pizza1 = PizzaFactory.getPizza("veg");

        pizza1.prepare();
        Pizza pizza2 = PizzaFactory.getPizza("Cheese");
        pizza2.prepare();

    }
}
