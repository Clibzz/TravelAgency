package com.nhlstenden.travelAgency;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String name() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
