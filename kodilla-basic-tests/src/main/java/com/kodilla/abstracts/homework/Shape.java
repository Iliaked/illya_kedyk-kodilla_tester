package com.kodilla.abstracts.homework;

public abstract class Shape {

    private int sideA;
    private int sideB;


    public Shape (int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public int getSideA() {
        return sideA;
    }
    public int getSideB() {
        return sideB;
    }

    public abstract void calculateArea();
    public abstract void calculatePerimeter();
}
