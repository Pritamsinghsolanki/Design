package org.example.ParkingLot.factory;

import org.example.ParkingLot.enums.VehicleType;
import org.example.ParkingLot.model.*;

public class VehicleFactory {
    public static Vehicle create(String number, VehicleType type)
    {
        return switch(type){
               case CAR -> new Car(number);
               case BIKE -> new Bike(number);
               case TRUCK -> new Truck(number);
        };
    }
}
