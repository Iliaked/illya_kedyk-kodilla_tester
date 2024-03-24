package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Krakow", "Berlin"));
        flights.add(new Flight("Berlin", "Krakow"));
        flights.add(new Flight("London", "Krakow"));
        flights.add(new Flight("Paris", "Krakow"));
        flights.add(new Flight("London", "Krakow"));
        flights.add(new Flight("Krakow", "Paris"));
        flights.add(new Flight("Krakow", "London"));
        return flights;
    }

    public static void main(String[] args) {
        getFlightsTable();
    }
}
