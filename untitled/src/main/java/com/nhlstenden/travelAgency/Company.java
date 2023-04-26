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

    /**
     * Calculate the total revenue of all the cars of a company
     * @return The total revenue
     */
    public double calcTotalRevenueOfCars() {
        double totalRevenue = 0;
        if (trips.size() > 0) {
            for (Trip trip : this.trips) {
                totalRevenue += trip.getCar().calculateCosts(trip.getDistance());
            }
        }
        return totalRevenue;
    }

    /**
     * Calculate the average distance of all the cars of a company
     * @return The average distance
     */
    public double calcAverageDistanceOfCars() {
        double totalDistance = 0;
        if (trips.size() > 0) {
            for (Trip trip : this.trips) {
                totalDistance += trip.getDistance();
            }
        }
        return totalDistance / this.cars.size();
    }

    /**
     * Get the trip with the longest distance
     * @return The name and distance of the trip
     */
    public String getLongestDistance() {
        int longestDistance = 0;
        String longestTripName = "";
        if (trips.size() > 0) {
            for (Trip trip : this.trips) {
                if (trip.getDistance() >= longestDistance) {
                    longestDistance = trip.getDistance();
                    longestTripName = trip.getName();
                }
            }
        }
        return "The longest trip is " + longestTripName + " with a distance of " + longestDistance;
    }

    /**
     * Get the chauffeur with the most revenue
     * @return The chauffeur
     */
    public Chauffeur getChauffeurWithMostRevenue() {
        Chauffeur chauffeur = null;
        if (trips.size() > 0) {
            for (Trip trip : this.trips) {
                trip.getCar().getChauffeur().setRevenue(trip.getCar().getChauffeur().getRevenue() + trip.getCar().calculateCosts(trip.getDistance()));
                for (Chauffeur chauffeurMostRev : this.chauffeurs) {
                    if (chauffeurMostRev.getRevenue() >= chauffeur.getRevenue()) {
                        chauffeur = chauffeurMostRev;
                    }
                }
            }
        }
        return chauffeur;
    }
}
