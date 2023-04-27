package com.nhlstenden.travelAgency;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetrolTest {
    private Petrol car;
    private Chauffeur harry;
    private Trip trip;
    private Customer customer;

    @BeforeEach
    void setUp() {
        harry = new Chauffeur("Harry");
        car = new Petrol(harry, Brand.VOLVO, "999-XX-9");
        customer = new Customer("Klant");
        trip = new Trip("America", car, 71, customer);
    }

    @Test
    void calculateCosts() {
        assertEquals(35.5, car.calculateCosts(trip.getDistance()), 0.01, "Costs are incorrect");
        trip.setDistance(2);
        assertEquals(1, car.calculateCosts(trip.getDistance()), 0.01, "Costs are incorrect");
    }
}