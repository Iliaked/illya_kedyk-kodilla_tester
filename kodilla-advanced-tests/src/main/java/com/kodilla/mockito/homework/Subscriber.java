package com.kodilla.mockito.homework;

import java.util.Objects;

public class Subscriber implements SubscriberInterface {
    private String name;
    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void updateTemperature(Temperature temperature) {
        System.out.println("Average daily temperature today: " + temperature);;
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println("Weather alert! " + message);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscriber that = (Subscriber) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
