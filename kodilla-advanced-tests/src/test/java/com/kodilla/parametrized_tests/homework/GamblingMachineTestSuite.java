package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineNumbers.csv", numLinesToSkip = 1)
    void testHowManyWins(int num1, int num2, int num3, int num4, int num5, int num6) throws InvalidNumbersException {
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(num1);
        userNumbers.add(num2);
        userNumbers.add(num3);
        userNumbers.add(num4);
        userNumbers.add(num5);
        userNumbers.add(num6);

        GamblingMachine machine = new GamblingMachine();
        assertTrue(machine.howManyWins(userNumbers) >= 0);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void testInvalidNumbersException_TooFewNumbers(int number) {
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(number);

        GamblingMachine machine = new GamblingMachine();
        InvalidNumbersException exception = assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(userNumbers));

        assertEquals("Wrong numbers provided", exception.getMessage());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 8, 12, 23})
    void testInvalidNumbersException_TooManyNumbers(int number) {
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(number);

        GamblingMachine machine = new GamblingMachine();
        InvalidNumbersException exception = assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(userNumbers));

        assertEquals("Wrong numbers provided", exception.getMessage());
    }
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 8, 70})
    void testInvalidNumbersExceptionNumbersOutOfRange(int number) {
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(number);

        GamblingMachine machine = new GamblingMachine();
        InvalidNumbersException exception = assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(userNumbers));

        assertEquals("Wrong numbers provided", exception.getMessage());
    }
}
