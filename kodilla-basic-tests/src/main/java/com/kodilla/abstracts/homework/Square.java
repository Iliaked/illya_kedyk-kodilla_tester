package com.kodilla.abstracts.homework;

public class Square extends Shape{
    public Square() {
        super(3, 3);
    }

    @Override
    public void calculateArea() {
        int area = getSideA()*getSideA();
        System.out.println(area);
    }

    @Override
    public void calculatePerimeter() {
        int perimeter = getSideA()*4;
        System.out.println(perimeter);
    }
}
