package org.example.DesignPatterns.Creational.Factory;

public class PizzaFactory {
    public static Pizza getPizza(String type)
    {
        if(type.equalsIgnoreCase("Veg"))
        {
            return new VegPizza();
        }
        else if(type.equalsIgnoreCase("Cheese")) {
            return new CheesePizza();
        }
        return null;
    }
}
