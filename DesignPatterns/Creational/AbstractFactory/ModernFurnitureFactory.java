package org.example.DesignPatterns.Creational.AbstractFactory;

public class ModernFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTABLE() {
        return new ModernTable();
    }
}
