package org.example.DesignPatterns.Behavioral.Observer;

public class Subscriber implements Observer{

    private String name;

    public Subscriber(String name)
    {
        this.name = name;
    }
    public void update(String message)
    {
        System.out.println("Notified with message"+ message);
    }
}
