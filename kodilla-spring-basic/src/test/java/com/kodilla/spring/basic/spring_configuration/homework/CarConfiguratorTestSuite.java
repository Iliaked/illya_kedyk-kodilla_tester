package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootTest
public class CarConfiguratorTestSuite {
    @Test
    public void shouldReturnCorrectCarDependingOnSeason() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("selectCar");
        String season = Seasons.getSeason(LocalDate.now());
        if (season.equals("Summer")) {
            Assertions.assertEquals("Cabrio", car.getCarType());
        } else if (season.equals("Winter")) {
            Assertions.assertEquals("SUV", car.getCarType());
        } else {
            Assertions.assertEquals("Sedan", car.getCarType());
        }
    }
    @Test
    public void shouldCheckIfLightsAreOn() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("selectCar");
        int hour = LocalTime.now().getHour();
        if (hour >= 20 || hour <= 6) {
            Assertions.assertTrue(car.hasHeadlightsTurnedOn());
        } else {
            Assertions.assertFalse(car.hasHeadlightsTurnedOn());
        }
    }
}
