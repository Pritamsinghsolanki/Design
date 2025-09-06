package org.example.DesignPatterns.Creational.Prototype;

/*
* When to Use?

When object creation is expensive.

Example: Prototypes of enemies in a game, configuration templates.*/
public class Main {
    public static void main(String[] args)
    {
        GameCharacter G1 = new GameCharacter("Soldier");

        G1.show();

        GameCharacter G2 = G1.clone();

        G2.show();

    }
}
