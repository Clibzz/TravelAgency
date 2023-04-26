package com.nhlstenden.travelAgency;
public abstract class Car {
    private Chauffeur chauffeur;
    private Brand brand;
    private String licensePlate;

    public Car(Chauffeur chauffeur, Brand brand, String licensePlate) {
        this.chauffeur = chauffeur;
        this.brand = brand;
        checkLicensePlate(licensePlate);
    }

    public Chauffeur getChauffeur() {
        return this.chauffeur;
    }

    public void setChauffeur(Chauffeur chauffeur) {
        this.chauffeur = chauffeur;
    }

    public Brand getBrand() {
        return this.brand;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        checkLicensePlate(licensePlate);
    }

    public void checkLicensePlate(String licensePlate) {
        //TODO check for license plate
    }

    public abstract double calculateCosts(double distance);
}
