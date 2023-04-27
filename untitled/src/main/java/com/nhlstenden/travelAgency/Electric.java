package com.nhlstenden.travelAgency;

public class Electric extends Car {
    private double price;

    public Electric(Chauffeur chauffeur, Brand brand, String licensePlate) {
        super(chauffeur, brand, licensePlate);
        this.price = 0.25;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public double calculateCosts(double distance) {
        return distance * this.price;
    }
}
