package org.example.OOPS.Encapsulation;


/*
* Encapsulation – ATM PIN Security

You don’t see how your PIN is verified internally, you just enter it.

Data (PIN) is hidden, only methods like validatePIN() are exposed.
Protects sensitive data (just like banking systems).
*
* Accessible though controlled methods
* */
public class ATM {
    private String PIN = "1234";

    public boolean validatePIN(String pin)
    {
        return this.PIN.equals(pin);
    }
}
