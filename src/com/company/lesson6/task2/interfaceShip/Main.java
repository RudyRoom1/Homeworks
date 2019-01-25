package com.company.lesson6.task2.interfaceShip;

//Task2
//6. interface Корабль <- abstract class Военный Корабль <- class Авианосец.

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        shipInterface();
    }

    public static void shipInterface() {
        MilitaryShip orlando = new AircraftShip("Orlando");
        AircraftShip orlandos = new AircraftShip("Orlando");
        ArrayList<String> arming = new ArrayList<>();
        arming.add("Rockets");
        arming.add("Antiaircraft gun");
        arming.add("Planes");

        ((AircraftShip) orlando).setArming(arming);
        orlandos.setArming(arming);
        orlando.armingShoot();
    }
}
