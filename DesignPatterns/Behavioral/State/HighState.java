package org.example.DesignPatterns.Behavioral.State;

public class HighState implements State{
    @Override
    public void handle() {
        System.out.println("Fan is running at HIGH Speed");
    }
}
