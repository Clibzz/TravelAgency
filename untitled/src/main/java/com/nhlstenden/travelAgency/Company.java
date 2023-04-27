package com.nhlstenden.travelAgency;

import java.util.HashSet;

public class Company {
    private String name;
    private HashSet<Car> cars;
    private HashSet<Trip> trips;

    public Company(String name) {
        this.name = name;
        this.cars = new HashSet<>();
        this.trips = new HashSet<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<Car> getCars() {
        return this.cars;
    }

    public void addCars(Car car) {
        this.cars.add(car);
    }

    public HashSet<Trip> getTrips() {
        return this.trips;
    }

    public void addTrips(Trip trip) {
        this.trips.add(trip);
    }

    /**
     * Calculate the total revenue of all the cars of a company
     *
     * @return The total revenue
     */
    public double calcTotalRevenueOfCars() {
        double totalRevenue = 0;
        if (trips.size() > 0) {
            for (Trip trip : getTrips()) {
                totalRevenue += trip.getCar().calculateCosts(trip.getDistance());
            }
        }
        return totalRevenue;
    }

    /**
     * Calculate the average distance of all the cars of a company
     *
     * @return The average distance
     */
    public double calcAverageDistanceOfCars() {
        double totalDistance = 0;
        if (trips.size() > 0) {
            for (Trip trip : getTrips()) {
                totalDistance += trip.getDistance();
            }
        }
        return totalDistance / this.cars.size();
    }

    /**
     * Get the trip with the longest distance
     *
     * @return The name and distance of the trip
     */
    public String getLongestDistance() {
        int longestDistance = 0;
        String longestTripName = null;
        if (trips.size() > 0) {
            for (Trip trip : getTrips()) {
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
     *
     * @return The chauffeur
     */
    public String getChauffeurWithMostRevenue() {
        Chauffeur chauffeur = null;
        double revenue = 0;
        for (Trip trip : getTrips()) {
            if (trip.getCar().getChauffeur().getRevenue() > revenue) {
                revenue = trip.getCar().getChauffeur().getRevenue();
                chauffeur = trip.getCar().getChauffeur();
            }
        }
        return chauffeur.getName();
    }
}
