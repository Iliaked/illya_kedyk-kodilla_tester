package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Porsche;

public class CarUtils {
    private static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Porsche)
            return "Porsche";
        else
            return "Unknown car name";
    }
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car type: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());
    }
}
