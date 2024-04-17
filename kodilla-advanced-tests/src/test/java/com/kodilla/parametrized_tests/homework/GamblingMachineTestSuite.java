package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
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
    @ValueSource(strings = {"1,2,3,4,8", "1,2,3,4,5"})
    void testInvalidNumbersException_TooFewNumbers(String numbers) {
        String[] split = numbers.split(",");
        Set<Integer> userNumbers = new HashSet<>();
        for (String number : split) {
            int i = Integer.parseInt(number);
            userNumbers.add(i);
        }
        GamblingMachine machine = new GamblingMachine();
        InvalidNumbersException exception = assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(userNumbers));

        assertEquals("Wrong numbers provided", exception.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {"1,2,3,4,8,9,10", "1,2,3,4,5,12,14"})
    void testInvalidNumbersException_TooManyNumbers(String numbers) {
        String[] split = numbers.split(",");
        Set<Integer> userNumbers = new HashSet<>();
        for (String number : split) {
            int i = Integer.parseInt(number);
            userNumbers.add(i);
        }
        GamblingMachine machine = new GamblingMachine();
        InvalidNumbersException exception = assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(userNumbers));

        assertEquals("Wrong numbers provided", exception.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {"1,2,3,4,8,70", "1,2,3,4,5,66"})
    void testInvalidNumbersExceptionNumbersOutOfRange(String numbers) {
        String[] split = numbers.split(",");
        Set<Integer> userNumbers = new HashSet<>();
        for (String number : split) {
            int i = Integer.parseInt(number);
            userNumbers.add(i);
        }
        GamblingMachine machine = new GamblingMachine();
        InvalidNumbersException exception = assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(userNumbers));

        assertEquals("Wrong numbers provided", exception.getMessage());
    }
}
