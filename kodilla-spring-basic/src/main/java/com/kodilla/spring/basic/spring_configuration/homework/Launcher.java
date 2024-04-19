package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;

public class Launcher {
    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarConfigurator.class)) {

            CarConfigurator carConfigurator = context.getBean(CarConfigurator.class);

            Car selectedCar = carConfigurator.selectCar();

            System.out.println("What season is it? " + Seasons.getSeason(LocalDate.now()));
            System.out.println("Chosen car: " + selectedCar.getCarType());
            System.out.println("Are lights on? " + selectedCar.hasHeadlightsTurnedOn());
        }
    }
}
