package org.example.DesignPatterns.Behavioral.State;

/*
When to Use?
When an object changes its behavior based on internal state.
*/
public class Main {
    public static void main(String[] args)
    {
        Fan fan = new Fan();
        fan.setState(new HighState());
        fan.pressButton();


        fan = new Fan();
        fan.setState(new OffState());
        fan.pressButton();

    }
}
