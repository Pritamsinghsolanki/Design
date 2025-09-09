package org.example.ParkingLot.model;

import org.example.ParkingLot.enums.GateType;
import org.example.ParkingLot.enums.PaymentMode;
import org.example.ParkingLot.service.ParkingLot;

import java.time.LocalDateTime;

public class ExitGate extends Gate{
    public ExitGate (String id)
    {
        super(id);
    }

    @Override
    public GateType getType(){
        return GateType.EXIT;
    }

    public void unparkVehicle(String ticketId, LocalDateTime exitTime, PaymentMode paymentMode)
    {
        ParkingLot.getInstance().unparkVehicle(ticketId, exitTime, paymentMode);
    }
}
