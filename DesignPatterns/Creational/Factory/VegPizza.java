package org.example.DesignPatterns.Creational.Factory;

public class VegPizza implements Pizza{
    @Override
    public void prepare() {
         System.out.println("Preparing: Veg Pizza");
    }
}
