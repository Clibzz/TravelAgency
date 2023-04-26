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

    //TODO Calculate trip costs
}