package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car ford = new Ford(50);
        Car opel = new Opel(50);
        Car porsche = new Porsche(50);

        doRace(ford);
        doRace(opel);
        doRace(porsche);
    }
    public static void doRace(Car car) {
        for (int i = 0; i < 3; i++) {
            car.increaseSpeed();
        }

        for (int i = 0; i < 2; i++) {
            car.decreaseSpeed();
        }

        System.out.println("Final speed is: " + car.getSpeed());
    }
}
