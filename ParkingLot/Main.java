package org.example.ParkingLot;

import org.example.ParkingLot.enums.PaymentMode;
import org.example.ParkingLot.enums.PricingStratergyType;
import org.example.ParkingLot.enums.VehicleType;
import org.example.ParkingLot.factory.PricingStrategyFactory;
import org.example.ParkingLot.factory.VehicleFactory;
import org.example.ParkingLot.model.*;
import org.example.ParkingLot.service.ParkingLot;
import org.example.ParkingLot.utils.DateTimeParser;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args)
    {
        ParkingLot lot = ParkingLot.getInstance();
        EntryGate entryGate = new EntryGate("EG1");
        ExitGate exitGate = new ExitGate("XG1");

        lot.setPricingStrategy(PricingStrategyFactory.get(PricingStratergyType.valueOf("EVENT_BASED")));


        ParkingFloor floor1 = new ParkingFloor("Floor1");
        floor1.addSpot(new ParkingSpot("F1S1", VehicleType.BIKE));
        floor1.addSpot(new ParkingSpot("F1S2", VehicleType.CAR));
        floor1.addSpot(new ParkingSpot("F1S3", VehicleType.TRUCK));
        floor1.addSpot(new ParkingSpot("F1S4", VehicleType.CAR));

        lot.addFloor(floor1);

        System.out.println("-------------------------------------------");

        Vehicle car = VehicleFactory.create("KA01AB1234", VehicleType.CAR);

        LocalDateTime entryTime = DateTimeParser.parse("21 May 7:30 AM 2025");
        Ticket ticket = entryGate.parkVehicle(car, entryTime);

        System.out.println("--------------------------------------------");

        lot.printStatus();

        System.out.println("---------------------------------------------");

        LocalDateTime exitTime = DateTimeParser.parse("21 May 1:15 PM 2025");
        exitGate.unparkVehicle(ticket.getTicketId(), exitTime, PaymentMode.CARD);

        System.out.println("----------------------------------------------");
        lot.printStatus();


    }
}
