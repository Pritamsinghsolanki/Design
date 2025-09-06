package org.example.OOPS.Abstraction;


/*
* Abstraction – Online Payment Gateway

You just click “Pay with UPI/Card/Netbanking”, don’t see how each is processed.
* You only care about pay(), not the underlying implementation.
*
* */
abstract class Payment {
    abstract void pay(double amount);
}
