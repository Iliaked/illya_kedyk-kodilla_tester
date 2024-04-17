package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car {
    private boolean lightsOn;

    public Sedan(boolean lightsOn) {
        this.lightsOn = lightsOn;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return lightsOn;
    }

    @Override
    public String getCarType() {

        return "Sedan";
    }

    @Override
    public String toString() {
        if (hasHeadlightsTurnedOn()) {
            return getCarType() + ": Lights turned on";
        }
        return getCarType() + ": Lights turned off";
    }
}
