package com.nhlstenden.travelAgency;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    private Company company;
    private Chauffeur john;
    private Chauffeur jane;
    private Customer alex;
    private Customer lisa;
    private Diesel toyota;
    private Electric volvo;
    private Trip paris;
    private Trip madrid;

    @BeforeEach
    void setUp() {
        company = new Company("BOLT");
        john = new Chauffeur("John");
        jane = new Chauffeur("Jane");
        alex = new Customer("Alex");
        lisa = new Customer("Lisa");
        toyota = new Diesel(john, Brand.TOYOTA, "777-CC-7");
        volvo = new Electric(jane, Brand.VOLVO, "555-DD-5");
        paris = new Trip("Paris", toyota, 485, alex);
        madrid = new Trip("Madrid", volvo, 1750, lisa);
    }
    @Test
    void calcTotalRevenueOfCars() {
        company.addCars(toyota);
        company.addTrips(paris);
        assertEquals(449.55, company.calcTotalRevenueOfCars(), "The total revenue is incorrect");
        company.addCars(volvo);
        assertEquals(449.55, company.calcTotalRevenueOfCars(), "The total revenue is incorrect");
        company.addTrips(madrid);
        assertEquals(887.05, company.calcTotalRevenueOfCars(), "The total revenue is incorrect");
        company.getTrips().remove(paris);
        assertEquals(437.5, company.calcTotalRevenueOfCars(), "The total revenue is incorrect");
    }

    @Test
    void calcAverageDistanceOfCars() {
        company.addCars(volvo);
        company.addTrips(madrid);
        assertEquals(1750, company.calcAverageDistanceOfCars(), "The average distance is incorrect");
        company.addCars(toyota);
        assertEquals(875, company.calcAverageDistanceOfCars(), "The average distance is incorrect");
        company.addTrips(paris);
        assertEquals(1117.5, company.calcAverageDistanceOfCars(), "The average distance is incorrect");
        company.getTrips().remove(madrid);
        company.getCars().remove(volvo);
        assertEquals(485, company.calcAverageDistanceOfCars(), "The average distance is incorrect");
    }

    @Test
    void getLongestDistance() {
    }

    @Test
    void getChauffeurWithMostRevenue() {
    }
}