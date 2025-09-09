package org.example.ParkingLot.service;

import lombok.Setter;
import org.example.ParkingLot.enums.PaymentMode;
import org.example.ParkingLot.enums.PricingStratergyType;
import org.example.ParkingLot.factory.PaymentStrategyFactory;
import org.example.ParkingLot.factory.PricingStrategyFactory;
import org.example.ParkingLot.model.ParkingFloor;
import org.example.ParkingLot.model.ParkingSpot;
import org.example.ParkingLot.model.Ticket;
import org.example.ParkingLot.model.Vehicle;
import org.example.ParkingLot.strategy.Payment.PaymentStrategy;
import org.example.ParkingLot.strategy.Pricing.PricingStrategy;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ParkingLot {
    private static final ParkingLot INSTANCE = new ParkingLot();

    private final Map<String, ParkingFloor> floors = new HashMap<>();
    private final Map<String, Ticket> activeTickets = new HashMap<>();
    @Setter
    private PricingStrategy pricingStrategy;

    private ParkingLot() {
        this.pricingStrategy = PricingStrategyFactory.get(PricingStratergyType.TIME_BASED);
    }

    public static ParkingLot getInstance() {
        return INSTANCE;
    }

    public void addFloor(ParkingFloor floor) {
        floors.put(floor.getId(), floor);
    }

    public synchronized Ticket parkVehicle(Vehicle vehicle, LocalDateTime entryTime) {
        for (ParkingFloor floor : floors.values()) {
            ParkingSpot spot = floor.findAvailableSpot(vehicle.getType());

            if (spot != null) {
                //successfully reserved the spot via atomic opration
                String ticketId = UUID.randomUUID().toString();
                Ticket ticket = Ticket.builder()
                        .ticketId(ticketId)
                        .entryTime(entryTime)
                        .vehicle(vehicle)
                        .floorId(floor.getId())
                        .spotId(spot.getId())
                        .build();

                activeTickets.put(ticketId, ticket);
                System.out.println("Vehicle parked. Ticket:" + ticketId);
                return ticket;
            }
        }
        return null;
    }

    public void unparkVehicle(String ticketId, LocalDateTime exitTime, PaymentMode paymentMode) {
        Ticket ticket = activeTickets.get(ticketId);
        if(ticket == null)
        {
            System.out.println("Invalid ticket ID.");
            return;
        }
        double fee = pricingStrategy.calculateFee(ticket.getVehicle().getType(),
                                                  ticket.getEntryTime(),exitTime);

        PaymentStrategy strategy = PaymentStrategyFactory.get(paymentMode);
        PaymentProcessor processor = new PaymentProcessor(strategy);
        boolean paid = processor.pay(ticket, fee);

        if(!paid)
        {
            System.out.println("Vehicle cannot exist, Payment Successful");
        }

        ParkingSpot spot = floors.get(ticket.getFloorId()).getSpots().get(ticket.getSpotId());
        spot.vacate();
        activeTickets.remove(ticketId);

        System.out.println("Vehicle exited. Fee Charged: "+ fee);

    }

    public void printStatus() {
        for(ParkingFloor floor : floors.values())
        {
            System.out.println("Floor Id: "+ floor.getId());
            for(ParkingSpot spot: floor.getSpots().values()){
                String status = spot.isOccupied() ? "Occupied" : "Available";
                System.out.println("  Spot ID: " + spot.getId() +
                        " | Type: " + spot.getAllowedType() +
                        " | Status: " + status);
            }
        }
    }
}
