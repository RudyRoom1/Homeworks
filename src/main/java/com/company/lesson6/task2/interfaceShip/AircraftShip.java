package com.company.lesson6.task2.interfaceShip;

import java.util.ArrayList;

public class AircraftShip extends MilitaryShip implements Ship {
    private ArrayList<String> arming;
    private String nameOfShip;

    AircraftShip (String nameOfShip) {
        this.nameOfShip = nameOfShip;
    }

    public ArrayList<String> getArming() {
        return arming;
    }

    public String getNameOfShip() {
        return nameOfShip;
    }

    public void setArming(ArrayList<String> nameOfArming) {
        this.arming = nameOfArming;
    }

    @Override
    public void sail() {
        System.out.println("AircraftShip is sailing");
    }

    @Override
    public void armingShoot() {
        AircraftShip ship;

        System.out.println("AircraftShip is shooting " + this.arming);
    }
}
