package org.example.DesignPatterns.Behavioral.State;

public class LowState implements State{
    public void handle() {
        System.out.println("Fan is running at LOW Speed");
    }
}
