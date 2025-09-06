package org.example.OOPS.Polymorphism.RunTime;


/*
* Overloading → Different methods, same name.
  Overriding → Same method, different implementation.
* */
public class Main {
    public static void main(String[] args) {
        Delivery d = new Delivery();
        d.deliver();

        Delivery pd = new PrimeDelivery();
        pd.deliver();
    }
}
