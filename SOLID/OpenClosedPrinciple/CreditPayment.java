package org.example.SOLID.OpenClosedPrinciple;

public class CreditPayment extends Payment{
    @Override
    void pay(double amount) {
        System.out.println("Paid "+amount+" using Credit Card");
    }
}
