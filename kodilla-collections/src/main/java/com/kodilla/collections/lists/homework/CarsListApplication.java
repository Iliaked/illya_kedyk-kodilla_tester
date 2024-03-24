package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Porsche;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car ford = new Ford(100);
        Car opel = new Opel(80);
        Car porsche = new Porsche(150);

        cars.add(ford);
        cars.add(opel);
        cars.add(porsche);

        System.out.println("Cars in the collection:");
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(0);
        cars.remove(opel);

        System.out.println("Cars after removal:");
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        System.out.println("Size of the collection: " + cars.size());
    }
}
