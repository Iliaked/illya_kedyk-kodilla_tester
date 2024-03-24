package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    void testFindFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightsFromLondon = flightFinder.findFlightsFrom("London");

        assertEquals(2, flightsFromLondon.size());
        assertEquals("London", flightsFromLondon.get(0).getDeparture());
        assertEquals("London", flightsFromLondon.get(1).getDeparture());
    }

    @Test
    void testFindFlightsTo() {

        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightsToKrakow = flightFinder.findFlightsTo("Krakow");

        assertEquals(4, flightsToKrakow.size());
        assertEquals("Krakow", flightsToKrakow.get(0).getArrival());
        assertEquals("Krakow", flightsToKrakow.get(1).getArrival());
        assertEquals("Krakow", flightsToKrakow.get(2).getArrival());
        assertEquals("Krakow", flightsToKrakow.get(3).getArrival());
    }
}