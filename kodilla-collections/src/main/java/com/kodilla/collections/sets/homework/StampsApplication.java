package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {

    public static void main(String[] args) {
        Set<Stamp> stampCollection = new HashSet<>();

        Stamp stamp1 = new Stamp("First Stamp", "2x2", true);
        Stamp stamp2 = new Stamp("Second Stamp", "3x3", false);
        Stamp stamp3 = new Stamp("Third Stamp", "2x2", true);
        Stamp stamp4 = new Stamp("Fourth Stamp", "4x4", false);

        stampCollection.add(stamp1);
        stampCollection.add(stamp2);
        stampCollection.add(stamp3);
        stampCollection.add(stamp4);
        stampCollection.add(stamp1);

        System.out.println("Stamp Collection:");
        for (Stamp stamp : stampCollection) {
            System.out.println(stamp);
        }
    }
}
