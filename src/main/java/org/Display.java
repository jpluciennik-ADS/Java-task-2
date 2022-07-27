package org;

import org.vehicle.Boat;
import org.vehicle.Sailboat;
import org.vehicle.Vehicle;

public class Display {
    static void displayVechicle(Container<Vehicle> container) {
        Vehicle vehicle = container.getValue();
        System.out.println("weight: " + vehicle.getWeight());
    }
    static void displayBoat(Container<Boat> container) {
        Boat boat = container.getValue();
        System.out.println("weight: " + boat.getWeight() +
                ", draft: " + boat.getDraft());
    }
    static void displaySailboat(Container<Sailboat> container) {
        Sailboat sailboat = container.getValue();
        System.out.println("weight: " + sailboat.getWeight() +
                ", draft: " + sailboat.getDraft() +
                ", model: " + sailboat.getModel());
    }
}
