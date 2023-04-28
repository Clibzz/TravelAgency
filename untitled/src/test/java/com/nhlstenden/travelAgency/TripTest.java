package com.nhlstenden.travelAgency;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripTest {
    private Company company;
    private Chauffeur jane;
    private Customer lisa;
    private Electric volvo;
    private Trip madrid;
    private Trip barcelona;

    @BeforeEach
    void setUp() {
        company = new Company("BOLT");
        jane = new Chauffeur("Jane");
        lisa = new Customer("Lisa", 750.00);
        volvo = new Electric(jane, Brand.VOLVO, "555-DD-5");
        madrid = new Trip("Madrid", volvo, 1750, lisa);
        barcelona = new Trip("Barcelona", volvo, 1510, lisa);
    }
    @Test
    void setDistance() {
        company.addCars(volvo);
        company.addTrips(madrid);
        volvo.getChauffeur().getRevenue();
        assertEquals(437.5, volvo.getChauffeur().getRevenue(), "Revenue is incorrect");
        madrid.setDistance(1500);
        assertEquals(375, volvo.getChauffeur().getRevenue(), "Revenue is incorrect");
        company.addTrips(barcelona);
        assertEquals(752.5, volvo.getChauffeur().getRevenue(), "Revenue is incorrect");
        barcelona.setDistance(1200);
        assertEquals(675, volvo.getChauffeur().getRevenue(), "Revenue is incorrect");
    }
}