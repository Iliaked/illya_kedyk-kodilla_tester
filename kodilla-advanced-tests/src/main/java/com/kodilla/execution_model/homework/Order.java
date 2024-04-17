package com.kodilla.execution_model.homework;

import java.time.LocalDate;
public class Order {
    private double value;
    private LocalDate date;


    public Order(double value, LocalDate date) {
        this.value = value;
        this.date = date;
    }

    public double getOrderValue() {
        return value;
    }

    public LocalDate getOrderDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Order: " +
                "value - " + value +
                ", date: " + date;
    }
}
