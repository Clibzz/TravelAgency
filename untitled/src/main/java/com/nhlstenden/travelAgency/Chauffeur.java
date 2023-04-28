package com.nhlstenden.travelAgency;

public class Chauffeur {
    private String name;
    private double revenue;

    public Chauffeur(String name) {
        checkName(name);
        this.revenue = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        checkName(name);
    }

    public double getRevenue() {
        return this.revenue;
    }

    public void removeRevenue(double revenue) {
        this.revenue -= revenue;
    }

    protected void addRevenue(double revenue) {
        this.revenue += revenue;
    }

    /**
     * Check if the name has been filled in
     *
     * @param name The name of the chauffeur
     */
    public void checkName(String name) {
        if (name.isEmpty() || name.equals(" ")) {
            this.name = "BoltDriver";
        } else {
            this.name = name.substring(0, 1).toUpperCase() + name.substring(1);
        }
    }

}
