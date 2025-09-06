package org.example.OOPS.Polymorphism.CompileTime;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.withdraw(5000);
        atm.withdraw(10000, "example@upi");
    }
}
