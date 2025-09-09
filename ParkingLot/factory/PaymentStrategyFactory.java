package org.example.ParkingLot.factory;

import org.example.ParkingLot.enums.PaymentMode;
import org.example.ParkingLot.strategy.Payment.CardPayment;
import org.example.ParkingLot.strategy.Payment.CashPayment;
import org.example.ParkingLot.strategy.Payment.PaymentStrategy;
import org.example.ParkingLot.strategy.Payment.UpiPayment;

public class PaymentStrategyFactory {
    public static PaymentStrategy get(PaymentMode mode){
        return switch (mode) {
            case CASH -> new CashPayment();
            case UPI -> new UpiPayment();
            case CARD -> new CardPayment();
        };
    }
}
