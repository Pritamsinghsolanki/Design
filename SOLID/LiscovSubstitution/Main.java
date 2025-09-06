package org.example.SOLID.LiscovSubstitution;

/*
* Any subclass (Sparrow, Eagle) can be used in place of Bird → LSP satisfied.
* */
public class Main {
    public static void main(String[] args)
    {
        Bird b1 = new Sparrow();
        b1.fly();
        Bird b2 = new Eagle();
        b2.fly();
    }
}
