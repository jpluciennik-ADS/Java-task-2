package org.vehicle;

public class Boat extends Vehicle {
    private float draft;

    public Boat(float weight, float draft) {
        super(weight);
        this.draft = draft;
    }

    public float getDraft() {
        return draft;
    }

    public void setDraft(float draft) {
        this.draft = draft;
    }
}
