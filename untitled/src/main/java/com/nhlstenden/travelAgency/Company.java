package com.nhlstenden.travelAgency;

import java.util.HashSet;

public class Company {
    private String name;
    private HashSet<Car> cars;
    private HashSet<Trip> trips;
    private HashSet<Chauffeur> chauffeurs;

    public Company(String name) {
        this.name = name;
        this.cars = new HashSet<>();
        this.trips = new HashSet<>();
        this.chauffeurs = new HashSet<>();
    }

    public String name() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<Car> cars() {
        return this.cars;
    }

    public void addCars(Car car) {
        this.cars.add(car);
    }

    public HashSet<Trip> trips() {
        return this.trips;
    }

    public void addTrips(Trip trip) {
        this.trips.add(trip);
    }

    public HashSet<Chauffeur> chauffeurs() {
        return this.chauffeurs;
    }

    public void addChauffeurs(Chauffeur chauffeur) {
        this.chauffeurs.add(chauffeur);
    }

    public double calcTotalRevenueOfCars() {
        double totalRevenue = 0;
        for (Trip trip : this.trips) {
            totalRevenue += trip.getCar().calculateCosts(trip.getDistance());
        }
        return totalRevenue;
    }

    public double calcAverageDistanceOfCars() {
        double totalDistance = 0;
        for (Trip trip : this.trips) {
            totalDistance += trip.getDistance();
        }
        return totalDistance / this.cars.size();
    }

    //TODO Car with longest distance

    //TODO Chauffeur with most revenue
}
