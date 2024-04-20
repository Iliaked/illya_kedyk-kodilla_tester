package com.kodilla.mockito.homework;

public class Temperature {
    private int temperature;

    public Temperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return temperature + " degrees";
    }
}
