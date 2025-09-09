package org.example.ParkingLot.strategy.Payment;

import org.example.ParkingLot.model.Ticket;

public interface PaymentStrategy {
    boolean processPayment(Ticket ticket, double amount);
}
