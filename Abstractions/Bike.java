package org.example.Abstractions;

public class Bike extends Vehicle{
    public Bike(String brand) {
        super(brand);
    }

    @Override
    public void drive() {
        System.out.println(brand + " Bike is riding...");
    }

    @Override
    public void start() {
        System.out.println(brand + " Bike started with self-start.");
    }
}
