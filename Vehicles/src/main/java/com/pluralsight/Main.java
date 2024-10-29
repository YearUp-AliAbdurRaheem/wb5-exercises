package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        Car myCar = new Car();
        myCar.setColor("Blue");
        myCar.setNumberOfPassengers(4);

        SemiTruck bigTruck = new SemiTruck();
        bigTruck.setCargoCapacity(10000);

        Hovercraft hover = new Hovercraft();
        hover.setFuelCapacity(50);

        // Test Print
        System.out.println("Moped color: " + slowRide.getColor());
        System.out.println("Car passengers: " + myCar.getNumberOfPassengers());
    }
}