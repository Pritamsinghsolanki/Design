package org.example.ParkingLot.service;

import org.example.ParkingLot.enums.PaymentStatus;
import org.example.ParkingLot.model.Ticket;
import org.example.ParkingLot.strategy.Payment.PaymentStrategy;

public class PaymentProcessor {
    private final PaymentStrategy strategy;

    public PaymentProcessor(PaymentStrategy strategy)
    {
        this.strategy = strategy;
    }

    public boolean pay(Ticket ticket, double amount)
    {
        boolean success = strategy.processPayment(ticket, amount);
        if(success)
        {
            ticket.setPaymentStatus(PaymentStatus.SUCCESS);
        }
        else
        {
            ticket.setPaymentStatus(PaymentStatus.FAILED);
            System.out.println("Paymeny failed for ticket:"+ ticket.getTicketId());
        }
        return success;
    }
}
