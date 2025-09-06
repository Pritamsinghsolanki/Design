package org.example.OOPS.Abstraction;

public class OnlinePayment extends Payment{

    @Override
    void pay(double pay)
    {
        System.out.println("Payed through Online");
    }
}
