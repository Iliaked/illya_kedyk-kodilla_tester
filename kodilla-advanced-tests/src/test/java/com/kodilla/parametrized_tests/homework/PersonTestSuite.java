package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.BmiTestSource#bmiTestData")
    public void testBMI(double height, double weight, String expectedBMI) {
        Person person = new Person(height, weight);
        assertEquals(expectedBMI, person.getBMI());
    }
}
