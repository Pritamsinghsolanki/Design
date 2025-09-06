package org.example.Abstractions;

public interface VehicleFeatures {
    //constant ( public static final by default)

    int MAX_SPEED = 200;

    //abstract method(must be implemented)
    void start();

    //default method ( can be used or overridden)
    default void showMaxSpeed()
    {
        System.out.println("Max_speed"+ MAX_SPEED + "km/h");
    }

    //static method(calling using interface name only)
    static void vehicleInfo()
    {
        System.out.println("All vehicles must follow traffic rules!");
    }
}
