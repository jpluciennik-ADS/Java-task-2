package org.vehicle;

public class Sailboat extends Boat {

    private String model;

    public Sailboat(float weight, float draft, String model) {
        super(weight, draft);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
