package org;

import org.vehicle.Vehicle;

public class Container<T extends Vehicle>{
    private T value;

    public T getValue(){
        return this.value;
    }

    public void setValue(T value){
        this.value = value;
    }
}
