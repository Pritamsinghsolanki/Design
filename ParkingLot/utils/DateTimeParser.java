package org.example.ParkingLot.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeParser {
    public static LocalDateTime parse(String s) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM h:mm a yyyy", Locale.ENGLISH);
        return LocalDateTime.parse(s, formatter);
    }
}
