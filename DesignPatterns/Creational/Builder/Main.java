package org.example.DesignPatterns.Creational.Builder;

/*
*  Builder Pattern

➡ Used to create complex objects step by step.
Instead of a huge constructor with 10 arguments, we use a builder.
* */
public class Main {
    public static void main(String[] args)
    {
        Burger burger = new Burger.Builder()
                .bun("Sesame")
                .patty("Chocker")
                .cheese(true)
                .lettuce(true)
                .build();

        burger.showBurger();
    }
}
