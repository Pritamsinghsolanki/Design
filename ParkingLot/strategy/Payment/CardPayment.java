package org.example.ParkingLot.strategy.Payment;

import org.example.ParkingLot.model.Ticket;

public class CardPayment implements PaymentStrategy{
    @Override
    public boolean processPayment(Ticket ticket, double amount)
    {
        System.out.println("Paid "+ amount+ "for Ticket"+ ticket.getTicketId()+"via Card ");
        return true;
    }
}
