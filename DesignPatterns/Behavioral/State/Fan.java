package org.example.DesignPatterns.Behavioral.State;

public class Fan {
    private State state;
    public void setState(State state){ this.state = state;}
    public void pressButton()
    {
        state.handle();
    }
}
