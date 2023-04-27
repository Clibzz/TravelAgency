package com.nhlstenden.travelAgency;

public class Trip {
    private String name;
    private Car car;
    private int distance;
    private Customer customer;

    public Trip(String name, Car car, int distance, Customer customer) {
        this.name = name;
        this.car = car;
        this.distance = distance;
        this.customer = customer;
        this.car.getChauffeur().addRevenue(getCar().calculateCosts(getDistance()));
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getDistance() {
        return this.distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Get the costs of a single trip
     *
     * @param trip A trip
     * @return The costs of the trip
     */
    public double getTripCosts(Trip trip) {
        return trip.getCar().calculateCosts(trip.getDistance());
    }
}
