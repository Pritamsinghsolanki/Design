package org.example.DesignPatterns.Behavioral.Strategy;

//Context
public class ShoppingCart {
    private PaymentStratergy paymentStratergy;

    public void setPaymentStratergy(PaymentStratergy paymentStratergy)
    {
        this.paymentStratergy = paymentStratergy;
    }

    public void checkout(int amount)
    {
        paymentStratergy.pay(amount);
    }
}
