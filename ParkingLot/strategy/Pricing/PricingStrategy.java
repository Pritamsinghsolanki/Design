package org.example.ParkingLot.strategy.Pricing;

import org.example.ParkingLot.enums.VehicleType;

import java.time.LocalDateTime;

public interface PricingStrategy {
    double calculateFee(VehicleType type, LocalDateTime entryTime, LocalDateTime exitTime);
}
