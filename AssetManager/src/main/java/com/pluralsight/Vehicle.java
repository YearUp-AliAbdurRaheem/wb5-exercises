package com.pluralsight;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost,
                  String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    // Getters and Setters
    public String getMakeModel() { return makeModel; }
    public void setMakeModel(String makeModel) { this.makeModel = makeModel; }
    
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    
    public int getOdometer() { return odometer; }
    public void setOdometer(int odometer) { this.odometer = odometer; }

    @Override
    public double getValue() {
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - year;
        double value;

        // Still 
        if (age > 10) {
            value = 1000.00;
        } else {
            value = getOriginalCost();
            double depreciationRate;
            if (age <= 3) depreciationRate = 0.03;
            else if (age <= 6) depreciationRate = 0.06;
            else depreciationRate = 0.08;
            
            for (int i = 0; i < age; i++) {
                value = value * (1 - depreciationRate);
            }
        }

        // Mileage penalty except for Hondas and Toyotas for some reason ¯\_(ツ)_/¯
        if (odometer > 100000 && !makeModel.toLowerCase().contains("honda") 
            && !makeModel.toLowerCase().contains("toyota")) {
            value *= 0.75;
        }

        return value;
    }
}
