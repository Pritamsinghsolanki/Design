package org.example.ParkingLot.model;

import org.example.ParkingLot.enums.VehicleType;

public class Car extends Vehicle{
    public Car(String number){ super(number, VehicleType.CAR);}
}
