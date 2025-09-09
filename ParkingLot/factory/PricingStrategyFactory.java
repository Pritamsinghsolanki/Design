package org.example.ParkingLot.factory;

import org.example.ParkingLot.enums.PricingStratergyType;
import org.example.ParkingLot.strategy.Pricing.EventBasedPricing;
import org.example.ParkingLot.strategy.Pricing.PricingStrategy;
import org.example.ParkingLot.strategy.Pricing.TimeBasedPricing;

public class PricingStrategyFactory {
    public static PricingStrategy get(PricingStratergyType type)
    {
        return switch (type){
            case TIME_BASED -> new TimeBasedPricing();
            case EVENT_BASED -> new EventBasedPricing();
        };
    }
}
