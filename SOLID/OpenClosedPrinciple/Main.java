package org.example.SOLID.OpenClosedPrinciple;

public class Main {
    public static void main(String[] args) {
        Payment payment1 = new CreditPayment();
        payment1.pay(1000);

        Payment payment2 = new UPIPayment();
        payment2.pay(500);
    }
}
