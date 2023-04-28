package com.nhlstenden.travelAgency;

public class Diesel extends Car {
    private double price;

    public Diesel(Chauffeur chauffeur, Brand brand, String licensePlate) {
        super(chauffeur, brand, licensePlate);
        this.price = 0.63;
    }

    public double getPrice() {
        return this.price;
    }

    /**
     * Get the environmental surchange of a trip
     *
     * @param distance The distance of the trip
     * @return The environmental surcharge
     */
    private double getEnvironmentalSurcharge(double distance) {
        return Math.floor(distance / 10) * 3;
    }

    @Override
    public double calculateCosts(double distance) {
        return distance * getPrice() + getEnvironmentalSurcharge(distance);
    }
}
