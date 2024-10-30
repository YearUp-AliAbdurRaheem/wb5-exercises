package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        // Test assets
        assets.add(new House("My House", "2020-01-15", 250000.00, "123 Main St", 1, 2000, 5000));
        assets.add(new House("Vacation Home", "2021-06-01", 180000.00, "456 Beach Rd", 2, 1500, 4000));
        assets.add(new Vehicle("My Car", "2019-03-20", 25000.00, "Honda Civic", 2019, 65000));
        assets.add(new Vehicle("Razeen's Knock-Off Truck", "1975-11-30",
                3500.00, "Poord F-150", 1975, 120000));

        // Display all assets
        for (Asset asset : assets) {
            System.out.println("\nAsset Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + String.format("%.2f", asset.getOriginalCost()));
            System.out.println("Current Value: $" + String.format("%.2f", asset.getValue()));

            // Add specific details based on asset type, like address for a house and make/model for a vehicle
            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Make/Model: " + vehicle.getMakeModel() + " (" + vehicle.getYear() + ")");
            }
        }
    }
}