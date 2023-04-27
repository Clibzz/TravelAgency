package com.nhlstenden.travelAgency;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieselTest {
    private Diesel car;
    private Chauffeur pieter;
    private Trip trip;
    private Customer customer;

    @BeforeEach
    void setUp() {
        pieter = new Chauffeur("Pieter");
        car = new Diesel(pieter, Brand.VOLVO, "999-XX-9");
        customer = new Customer("Klant");
        trip = new Trip("Bolivia", car, 71, customer);

    }
    @Test
    void calculateCosts() {
        assertEquals(65.73, car.calculateCosts(trip.getDistance()), 0.01, "Costs are incorrect");
        trip.setDistance(2);
        assertEquals(1.26, car.calculateCosts(trip.getDistance()), 0.01, "Costs are incorrect");
    }
}