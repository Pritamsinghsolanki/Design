package org.example.OOPS.Abstraction;

public class OfflinePayment extends Payment{
    @Override
    void pay(double pay)
    {
        System.out.println("Payed through Offline");
    }
}
