package org.example.DesignPatterns.Behavioral.Strategy;

/*
✅ When to Use?

When you want to switch algorithms dynamically.

Examples: Payment systems, Sorting algorithms, Route finding.
 */
public class Main {
    public static void main(String[] args)
    {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStratergy(new CreditCardStratergy());
        cart.checkout(1300);

        cart.setPaymentStratergy(new PayPalPaymentStratergy());
        cart.checkout(1500);
    }
}
