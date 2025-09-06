package org.example.DesignPatterns.Creational.Factory;

public class CheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza");
    }
}
