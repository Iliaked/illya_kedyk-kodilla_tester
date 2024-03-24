package com.kodilla.abstracts.homework;

public class BusDriver extends Job {
    public BusDriver() {
        super(29.3, "Has to drive a bus");
    }

    @Override
    public void showResponsibilities() {
        System.out.println(getResponsibilities());
    }
}
