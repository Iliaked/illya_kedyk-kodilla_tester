package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem (int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("Operating system is on");
    }
    public void turnOff() {
        System.out.println("Operating system is off");
    }

    public int getYear() {
        return year;
    }
    public void displayReleaseYear() {
        System.out.println("Operating system was released in: " + getYear());
    }
}
