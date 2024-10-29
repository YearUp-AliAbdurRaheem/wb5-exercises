package com.pluralsight;

public class Hovercraft extends Vehicle {
    private boolean canFloat;

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public Hovercraft() {

    }

    public boolean canFloat() {
        return canFloat;
    }

    public void setCanFloat(boolean canFloat) {
        this.canFloat = canFloat;
    }
}
