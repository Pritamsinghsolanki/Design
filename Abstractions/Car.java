package org.example.Abstractions;

public class Car extends Vehicle{
    public Car(String brand)
    {
        super(brand);
    }

    // implementing abstract method from Vehicle
    @Override
    public void drive()
    {
        System.out.println(brand + "Car is driving...");
    }

    // implementing abstract method from interface
    @Override
    public void start() {
        System.out.println(brand + " Car started with key ignition.");
    }

    // overriding default method (optional)
    @Override
    public void showMaxSpeed() {
        System.out.println(brand + " Car Max Speed: " + MAX_SPEED + " km/h (Custom Limit)");
    }
}
