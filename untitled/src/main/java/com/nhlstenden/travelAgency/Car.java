package com.nhlstenden.travelAgency;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Car {
    private Chauffeur chauffeur;
    private Brand brand;
    private String licensePlate;

    public Car(Chauffeur chauffeur, Brand brand, String licensePlate) {
        this.chauffeur = chauffeur;
        this.brand = brand;
        checkLicensePlate(licensePlate);
    }

    public Chauffeur getChauffeur() {
        return this.chauffeur;
    }

    public void setChauffeur(Chauffeur chauffeur) {
        this.chauffeur = chauffeur;
    }

    public Brand getBrand() {
        return this.brand;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        checkLicensePlate(licensePlate);
    }

    /**
     * Check if a license plate is of the correct format
     *
     * @param licensePlate The license plate to check
     */
    public void checkLicensePlate(String licensePlate) {
        // Check if the license plate matches the format 999-XX-9
        Matcher lpMatcher = Pattern.compile("[0-9]{3}-[A-Z]{2}-[0-9]").matcher(licensePlate.toUpperCase());
        if (lpMatcher.find()) {
            this.licensePlate = licensePlate.toUpperCase();
        } else {
            // Split the string by the - character
            String[] splitLP = licensePlate.split("-");
            // Create a new empty String
            StringBuilder newLP = new StringBuilder();
            for (int i = 0; i < splitLP.length; i++) {
                String part = splitLP[i];
                // Check if the part matches a certain part of the regex
                if (part.matches("[A-Z]{2}")) {
                    newLP.append(part);
                } else if (part.matches("[0-9]{3}")) {
                    newLP.append(part);
                } else if (part.matches("[0-9]")) {
                    newLP.append(part);
                } else {
                    // If the first or last (digit) part is incorrect, set the value to -1,
                    // if the middle (letter) part is incorrect, set the value to null
                    if (i == 0 || i == 2) {
                        newLP.append("-1");
                    } else if (i == 1) {
                        newLP.append("null");
                    }
                }
                // Add a '-' to the end of each part except for the last part
                if (i < splitLP.length - 1) {
                    newLP.append("-");
                }
                this.licensePlate = newLP.toString().toUpperCase();
            }
        }
    }

    /**
     * Calculate the costs of a trip
     *
     * @param distance The distance of a trip
     * @return The costs of the trip
     */
    public abstract double calculateCosts(double distance);
}
