package org.example.DesignPatterns.Creational.AbstractFactory;


/*
* When to Use?

When we need families of related objects.

Example: Cross-platform UI toolkit (Windows Button, Windows Checkbox) vs (Mac Button, Mac Checkbox).
* */
public class Main {
    public static void main(String[] args)
    {
        FurnitureFactory factory = new ModernFurnitureFactory();
        Chair chair = factory.createChair();
        Table table = factory.createTABLE();
        chair.SitOn();
        table.user();

        factory = new VictorianFurnitureFactory();
        chair = factory.createChair();
        table = factory.createTABLE();
        chair.SitOn();
        table.user();
    }
}
