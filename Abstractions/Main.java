package org.example.Abstractions;

/*
* 🔹       Abstract Class vs Interface (Comparison)
Feature  	Abstract Class	                                             Interface
Methods    	Can have abstract + concrete methods	Only abstract (default & static methods allowed since Java 8)
Variables	Can have instance variables          	Only public static final (constants)
Inheritance	Single inheritance (class can extend only one abstract class)	Multiple inheritance (class can implement multiple interfaces)
Constructor	Can have constructors	                No constructors
Use Case	When classes share state + behavior 	When classes share only behavior (contract)
*
*
* Use abstract class when you want to provide some default behavior + enforce some methods.

Use interface when you only want to enforce rules (contract), and multiple inheritance is needed.
* */
public class Main {
    public static void main(String[] args)
    {
        Vehicle car = new Car("Tesla");
        Vehicle bike = new Bike("Yamaha");

        // Abstract class methods
        car.showBrand();
        car.drive();
        car.start();

        bike.showBrand();
        bike.drive();
        bike.start();

        // Interface default method
        car.showMaxSpeed();
        bike.showMaxSpeed();

        // Interface static method (called with Interface name)
        VehicleFeatures.vehicleInfo();
    }
}
