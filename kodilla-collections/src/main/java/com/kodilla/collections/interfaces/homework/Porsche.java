package com.kodilla.collections.interfaces.homework;

public class Porsche implements Car {
    private int speed;

    public Porsche (int speed) {
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 42;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 21;
    }
}

