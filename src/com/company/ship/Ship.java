package com.company.ship;

public class Ship {
    private String name;
    private int yearBuilt;

    public Ship()
    {
        this("N/A", -1);
    }

    public Ship(String name, int yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void printShipInfo() {
        System.out.println("Ship Name: " + name + "\t\tYear Built: " + yearBuilt);
    }
}
