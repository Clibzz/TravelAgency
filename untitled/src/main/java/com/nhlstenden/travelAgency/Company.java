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

    //TODO Revenue of all cars

    //TODO Average distance of all cars

    //TODO Car with longest distance
    
    //TODO Chauffeur with most revenue
}
