package com.nhlstenden.travelAgency;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChauffeurTest {
    private Chauffeur chauffeur;

    @BeforeEach
    void setUp() {
        chauffeur = new Chauffeur("Pieter");
    }

    @Test
    void checkName() {
        assertEquals("Pieter", chauffeur.getName(), "Name is incorrect");
        chauffeur.setName("");
        assertEquals("BoltDriver", chauffeur.getName(), "Name is incorrect");
        chauffeur.setName(" ");
        assertEquals("BoltDriver", chauffeur.getName(), "Name is incorrect");
        chauffeur.setName("Jonas");
        assertEquals("Jonas", chauffeur.getName(), "Name is incorrect");
        chauffeur.setName("michael");
        assertEquals("Michael", chauffeur.getName(), "Name is incorrect");
    }
}