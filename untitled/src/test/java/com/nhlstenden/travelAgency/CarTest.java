package com.nhlstenden.travelAgency;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private Diesel car;
    private Chauffeur pieter;

    @BeforeEach
    void setUp() {
        pieter = new Chauffeur("Pieter");
        car = new Diesel(pieter, Brand.VOLVO, "B99-XX-9");
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
}