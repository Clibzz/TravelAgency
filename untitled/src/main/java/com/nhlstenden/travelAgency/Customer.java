package com.nhlstenden.travelAgency;

public class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean payDebt(Trip trip) {
        if (trip.getCustomer() == this) {
            if (this.balance >= trip.getTripCosts(trip)) {
                this.balance -= trip.getTripCosts(trip);
                return true;
            }
        }
        return false;
    }
}
