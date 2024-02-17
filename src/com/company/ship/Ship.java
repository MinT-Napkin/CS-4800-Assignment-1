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

    public static void main(String[] args) {

        Ship[] ships = new Ship[3];

        ships[0] = new Ship();
        ships[1] = new CruiseShip();
        ships[2] = new CargoShip();

        ships[0].setName("Gigantic");
        ships[1].setName("Titanic");
        ships[2].setName("Atlantic");

        ships[0].setYearBuilt(1989);
        ships[1].setYearBuilt(1958);
        ships[2].setYearBuilt(2010);

        ((CruiseShip) ships[1]).setMaxPassengers(2000);
        ((CargoShip) ships[2]).setCargoCapacity(5000);

        System.out.println("\nPOLYMORPHISM");
        for (Ship ship : ships) {
            ship.printShipInfo();
        }
    }
}
