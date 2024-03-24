package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape square = new Square();

        square.calculateArea();
        square.calculatePerimeter();

        Shape rectangle = new Rectangle();

        rectangle.calculateArea();
        rectangle.calculatePerimeter();
    }
}
