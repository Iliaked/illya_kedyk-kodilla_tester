package com.kodilla.abstracts.homework;

public class Firefighter extends Job {
    public Firefighter() {
        super(43.5, "Has to extinguish fire");
    }

    @Override
    public void showResponsibilities() {
        System.out.println(getResponsibilities());
    }
}
