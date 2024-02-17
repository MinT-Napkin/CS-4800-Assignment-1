package com.company.ship;

public class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(){
        this("N/A", -1, -1);
    }


    public CruiseShip(String name, int yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public void printShipInfo() {
        System.out.println("Ship Name: " + getName() + "\t\tMaximum Passengers: " + maxPassengers);
    }
}

