package com.nhlstenden.travelAgency;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    private Trip england;
    private Trip berlin;
    private Customer martha;
    private Petrol volvo;
    private Chauffeur jonas;

    @BeforeEach
    void setUp() {
        martha = new Customer("Martha", 230.50);
        jonas = new Chauffeur("Jonas");
        volvo = new Petrol(jonas, Brand.VOLVO, "321-C-5");
        england = new Trip("England", volvo, 335, martha);
        berlin = new Trip("Berlin", volvo, 623, martha);
    }

    @Test
    void payDebt() {
        assertTrue(martha.payDebt(england));
        assertFalse(martha.payDebt(berlin));
        martha.setBalance(350.50);
        assertTrue(martha.payDebt(berlin));
    }
}