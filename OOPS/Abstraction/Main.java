package org.example.OOPS.Abstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Abstraction BRO");

        System.out.println("Offline or Online Payment");
        Scanner sc = new Scanner(System.in);

        String choice = sc.nextLine();

        if(choice.equals("Online"))
        {
            System.out.println("Enter the amount to be paid");
            Payment payment = new OnlinePayment();
            payment.pay(Double.parseDouble(sc.next()));
        }
        else
        {
            System.out.println("Enter the amount to be paid");
            Payment payment = new OfflinePayment();
            payment.pay(Double.parseDouble(sc.next()));
        }
    }
}
