package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BmiTestSource {
    public static Stream<Arguments> bmiTestData() {
        return Stream.of(
                Arguments.of(1.75, 40, "Very severely underweight"),
                Arguments.of(1.75, 46, "Severely underweight"),
                Arguments.of(1.75, 52, "Underweight"),
                Arguments.of(1.75, 68, "Normal (healthy weight)"),
                Arguments.of(1.75, 80, "Overweight"),
                Arguments.of(1.75, 95, "Obese Class I (Moderately obese)"),
                Arguments.of(1.75, 110, "Obese Class II (Severely obese)"),
                Arguments.of(1.75, 130, "Obese Class III (Very severely obese)"),
                Arguments.of(1.75, 150, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.75, 180, "Obese Class V (Super Obese)"),
                Arguments.of(1.75, 200, "Obese Class VI (Hyper Obese)")
        );
    }
}
