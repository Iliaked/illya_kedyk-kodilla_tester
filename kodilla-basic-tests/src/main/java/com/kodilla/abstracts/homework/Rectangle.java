package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    public Rectangle() {
        super(5, 8);
    }

    @Override
    public void calculateArea() {
        int area = getSideA()*getSideB();
        System.out.println(area);
    }

    @Override
    public void calculatePerimeter() {
        int perimeter = 2*(getSideA()+getSideB());
        System.out.println(perimeter);
    }
}
