package org.example.DesignPatterns.Creational.AbstractFactory;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTABLE() {
        return new VictorianTable();
    }
}
