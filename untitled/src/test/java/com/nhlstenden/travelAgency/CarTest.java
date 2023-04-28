package com.nhlstenden.travelAgency;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private Petrol car;
    private Chauffeur pieter;
    private Chauffeur petra;
    private Trip dusseldorf;
    private Customer anton;
    private Company company;

    @BeforeEach
    void setUp() {
        company = new Company("Bolt");
        pieter = new Chauffeur("Pieter");
        petra = new Chauffeur("Petra");
        car = new Petrol(pieter, Brand.VOLVO, "B99-XX-9");
        anton = new Customer("Anton", 630.25);
        dusseldorf = new Trip("Dusseldorf", car, 185, anton);
    }

    @Test
    void checkLicensePlate() {
        assertEquals("-1-XX-9", car.getLicensePlate(), "license plate is incorrect");
        car.setLicensePlate("999-1X-9");
        assertEquals("999-NULL-9", car.getLicensePlate(), "license plate is incorrect");
        car.setLicensePlate("99A-X9-A");
        assertEquals("-1-NULL--1", car.getLicensePlate(), "license plate is incorrect");
        car.setLicensePlate("AAA-XX-A");
        assertEquals("-1-XX--1", car.getLicensePlate(), "license plate is incorrect");
        car.setLicensePlate("999-X9-A");
        assertEquals("999-NULL--1", car.getLicensePlate(), "license plate is incorrect");
    }

    @Test
    void setChauffeur() {
        company.addCars(car);
        company.addTrips(dusseldorf);
        assertEquals(92.5, pieter.getRevenue(), "Revenue is incorrect");
        car.setChauffeur(petra, dusseldorf);
        assertEquals(0.00, pieter.getRevenue(), "Revenue is incorrect");
        assertEquals(92.5, petra.getRevenue(), "Revenue is incorrect");
    }
}