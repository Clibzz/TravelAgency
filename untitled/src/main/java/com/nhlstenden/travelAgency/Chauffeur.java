package com.nhlstenden.travelAgency;

public class Chauffeur {
    private String name;
    private double revenue;

    public Chauffeur(String name) {
        checkName(name);
        this.revenue = 0;
    }

    public String name() {
        return this.name;
    }

    public void setName(String name) {
        checkName(name);
    }

    public double getRevenue() {
        return this.revenue;
    }

    protected void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    /**
     * Check if the name has been filled in
     * @param name The name of the chauffeur
     */
    public void checkName(String name) {
        if (!name.isEmpty() || !name.equals("")) {
            this.name = name;
        } else {
            this.name = "BoltDriver";
        }
    }

}
