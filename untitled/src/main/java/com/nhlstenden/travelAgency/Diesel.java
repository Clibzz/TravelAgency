package com.nhlstenden.travelAgency;

public class Diesel extends Car {
    private double price;

    public Diesel(Chauffeur chauffeur, Brand brand, String licensePlate) {
        super(chauffeur, brand, licensePlate);
        this.price = 0.63;
    }

    public double price() {
        return this.price;
    }

    @Override
    public double calculateCosts(double distance) {
        return distance * this.price + ((distance / 10) * 3);
    }
}
