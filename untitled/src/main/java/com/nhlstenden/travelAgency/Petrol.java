package com.nhlstenden.travelAgency;

public class Petrol extends Car {
    private double price;

    public Petrol(Chauffeur chauffeur, Brand brand, String licensePlate) {
        super(chauffeur, brand, licensePlate);
        this.price = 0.50;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public double calculateCosts(double distance) {
        return distance * getPrice();
    }
}
