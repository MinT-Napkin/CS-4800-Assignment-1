package com.company.ship;

public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip() {
        this("N/A", -1, -1);
    }

    public CargoShip(String name, int yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void printShipInfo() {
        System.out.println("Ship Name: " + getName() + "\t\tCargo Capacity (in tonnage): " + cargoCapacity);
    }
}
