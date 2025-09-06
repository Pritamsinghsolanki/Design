package org.example.DesignPatterns.Behavioral.Strategy;

//Concrete Stratergy
public class CreditCardStratergy implements PaymentStratergy {
    public void pay(int amount)
    {
        System.out.println("Paying amount"+amount+"Using Credit Card");
    }
}
