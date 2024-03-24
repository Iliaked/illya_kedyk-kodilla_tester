package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.arrays.ShapeUtils;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Porsche;

import java.util.Random;

public class CarsApplication {
    public static Car drawCar() {
        Random random = new Random();
        int randomSpeed = random.nextInt(201);
        int carType = random.nextInt(3);
        if (carType == 0) {
            return new Ford(randomSpeed);
        } else if (carType == 1) {
            return new Opel(randomSpeed);
            }
        else {
            return new Porsche(randomSpeed);
        }
    }
    public static void main(String[] args) {

        Random random = new Random();
        int arraySize = random.nextInt(15) + 1;

        Car[] carsArray = new Car[arraySize];

        for (int i = 0; i < arraySize; i++) {
            carsArray[i] = drawCar();
        }
        for (Car car : carsArray)
            CarUtils.describeCar(car);
    }
}

