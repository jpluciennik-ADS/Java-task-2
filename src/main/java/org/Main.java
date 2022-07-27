package org;

import org.vehicle.Boat;
import org.vehicle.Sailboat;
import org.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        Container<Vehicle> vehicleContainer = new Container<>();
        Container<Boat> boatContainer = new Container<>();
        Container<Sailboat> sailboatContainer = new Container<>();

        Vehicle vehicle = new Vehicle(15.5f);
        Boat boat = new Boat(20.3f, 4.5f);
        Sailboat sailboat = new Sailboat(17.9f, 1.5f, "Omega");

        vehicleContainer.setValue(vehicle);
        boatContainer.setValue(boat);
        sailboatContainer.setValue(sailboat);

        Display.displayVechicle(vehicleContainer);
        Display.displayBoat(boatContainer);
        Display.displaySailboat(sailboatContainer);
    }
}
