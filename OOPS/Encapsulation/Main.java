package org.example.OOPS.Encapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Encapsulation BRO");

        System.out.print("Enter the PIN:");
        Scanner sc = new Scanner(System.in);

        String PIN = sc.nextLine();
        ATM atm = new ATM();

        if(atm.validatePIN(PIN))
        {
            System.out.println("Valid PIN");
        }
        else
        {
            System.out.println("Invalid-PIN");
        }
    }
}
