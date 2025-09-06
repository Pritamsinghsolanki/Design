package org.example.DesignPatterns.Behavioral.Strategy;

//Concrete Stratergy
public class PayPalPaymentStratergy implements PaymentStratergy {
    public void pay(int amount)
    {
        System.out.println("Paying amount"+amount+"with paypal");
    }
}
