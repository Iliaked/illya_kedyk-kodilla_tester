package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult, 0.0001);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int subtractResult = calculator.subtract(11, 4);
        assertEquals(7, subtractResult);
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        double squareResult = calculator.square((-4.0), 2.0);
        assertEquals(16.0, squareResult, 0.0001);
    }
}
