package org.example.OOPS.Polymorphism.CompileTime;

public class ATM {
    void withdraw(int amount)
    {
        System.out.println("Withdrawing "+amount);
    }
    void withdraw(int amount, String upiId)
    {
        System.out.println("Withdrawing "+amount+" through "+upiId);
    }
}
