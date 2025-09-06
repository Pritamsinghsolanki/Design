package org.example.DesignPatterns.Behavioral.Observer;

/*
* ✅ When to Use?

When changes in one object must be reflected in others.

Examples: Notifications, Stock market, Event handling.
* */
public class Main {
    public static void main(String[] args)
    {
        Channel ch1 = new Channel();

        Observer o1 = new Subscriber("Alice");
        Observer o2 = new Subscriber("Bob");

        ch1.subscribe((Subscriber) o1);
        ch1.subscribe((Subscriber) o2);

        ch1.notifyAllObservers("Hello");
    }
}
