package org.example.ParkingLot.strategy.Pricing;

import org.example.ParkingLot.enums.VehicleType;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TimeBasedPricing implements PricingStrategy{
    //peak period hours ( e.g: 8:00 to 17:00)
    private static final LocalTime PEAK_START = LocalTime.of(8,0);
    private static final LocalTime PEAK_END = LocalTime.of(17,0);

    private boolean isPeak(LocalTime time)
    {
        return !time.isBefore(PEAK_START) && !time.isAfter(PEAK_END);
    }

    @Override
    public double calculateFee(VehicleType type, LocalDateTime entryTime, LocalDateTime exitTime)
    {
        if(exitTime.isBefore(entryTime)) throw new IllegalArgumentException("Exit time before");

        long durationMinutes = Duration.between(entryTime, exitTime).toMinutes();
        long totalHours = (long) Math.ceil(durationMinutes/60.0);

        //count peak hours and non-peak hours by iterating hour by hour
        int peakHours = 0;
        int nonPeakHours = 0;

        LocalDateTime cursor = entryTime.truncatedTo(ChronoUnit.HOURS);

        for(int i=0;i< totalHours;i++)
        {
            LocalTime hourStart = cursor.toLocalTime();
            if(isPeak(hourStart)) peakHours++;
            else nonPeakHours++;
            cursor = cursor.plusHours(1);
        }


        double peakRate = switch ( type ) {
            case CAR -> 30.0;
            case BIKE -> 15.0;
            case TRUCK -> 50.0;
        };

        double nonPeakRate = switch ( type ) {
            case CAR -> 30.0;
            case BIKE -> 15.0;
            case TRUCK -> 50.0;
        };

        return peakHours*peakRate + nonPeakHours*nonPeakRate;

    }
}
