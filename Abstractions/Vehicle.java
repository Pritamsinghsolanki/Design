package org.example.Abstractions;

abstract class Vehicle implements VehicleFeatures{
    protected String brand; //instance variable


    //constructor
    public Vehicle(String brand)
    {
        this.brand = brand;
    }

    //concreate method
    public void showBrand()
    {
        System.out.println("Vehicle Brand:"+ brand);
    }

    //abstract method( must be implemented by sublcass)
    public abstract void drive();

}


