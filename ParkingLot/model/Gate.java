package org.example.ParkingLot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.ParkingLot.enums.GateType;

@Getter
@AllArgsConstructor
public abstract class Gate {
    protected final String id;
    public abstract GateType getType();
}
