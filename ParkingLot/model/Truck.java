package org.example.ParkingLot.model;

import org.example.ParkingLot.enums.VehicleType;

public class Truck extends Vehicle{
    public Truck(String number){ super(number, VehicleType.TRUCK);}
}
