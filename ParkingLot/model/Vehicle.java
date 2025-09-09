package org.example.ParkingLot.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.ParkingLot.enums.VehicleType;

@Getter
@RequiredArgsConstructor
public abstract class Vehicle {
    private final String number;
    private final VehicleType type;
}
