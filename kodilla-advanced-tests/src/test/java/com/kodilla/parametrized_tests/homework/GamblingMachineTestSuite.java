package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GamblingMachineTestSuite {

    /*test pierwszej metody będzie przechodził tylko w niektórych przypadkach, dlatego że nie da się przewidzieć
    ile będzie wygranych numerów porównując mój zestaw liczb z randomowymi
     */
    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineNumbers.csv", numLinesToSkip = 1)
    void testHowManyWins(int num1, int num2, int num3, int num4, int num5, int num6, int expectedWins) throws InvalidNumbersException {
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(num1);
        userNumbers.add(num2);
        userNumbers.add(num3);
        userNumbers.add(num4);
        userNumbers.add(num5);
        userNumbers.add(num6);

        GamblingMachine machine = new GamblingMachine();
        assertEquals(expectedWins, machine.howManyWins(userNumbers));
    }

    @Test
    void testInvalidNumbersException_TooFewNumbers() {
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(1);
        userNumbers.add(2);
        userNumbers.add(3);
        userNumbers.add(4);
        userNumbers.add(5);

        GamblingMachine machine = new GamblingMachine();
        InvalidNumbersException exception = assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(userNumbers));

        assertEquals("Wrong numbers provided", exception.getMessage());
    }

    @Test
    void testInvalidNumbersException_TooManyNumbers() {
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(1);
        userNumbers.add(2);
        userNumbers.add(3);
        userNumbers.add(4);
        userNumbers.add(8);
        userNumbers.add(12);
        userNumbers.add(23);

        GamblingMachine machine = new GamblingMachine();
        InvalidNumbersException exception = assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(userNumbers));

        assertEquals("Wrong numbers provided", exception.getMessage());
    }
    @Test
    void testInvalidNumbersExceptionNumbersOutOfRange() {
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(1);
        userNumbers.add(2);
        userNumbers.add(3);
        userNumbers.add(4);
        userNumbers.add(8);
        userNumbers.add(70);

        GamblingMachine machine = new GamblingMachine();
        InvalidNumbersException exception = assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(userNumbers));

        assertEquals("Wrong numbers provided", exception.getMessage());
    }
}
