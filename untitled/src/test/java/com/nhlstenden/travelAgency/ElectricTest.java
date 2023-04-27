package com.nhlstenden.travelAgency;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectricTest {
    private Electric car;
    private Chauffeur jan;
    private Trip trip;
    private Customer customer;

    @BeforeEach
    void setUp() {
        jan = new Chauffeur("Jan");
        car = new Electric(jan, Brand.TOYOTA, "999-XX-9");
        customer = new Customer("Klant", 150.00);
        trip = new Trip("Italy", car, 71, customer);
    }

    @Test
    void calculateCosts() {
        assertEquals(17.75, car.calculateCosts(trip.getDistance()), 0.01, "Costs are incorrect");
        trip.setDistance(2);
        assertEquals(0.5, car.calculateCosts(trip.getDistance()), 0.01, "Costs are incorrect");
    }
}