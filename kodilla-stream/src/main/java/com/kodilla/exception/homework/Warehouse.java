package com.kodilla.exception.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Warehouse {
    private Map<String, Order> orders = new HashMap<>();

    public void addOrder(Order order) {
        orders.put(order.getNumber(), order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        Optional<Order> foundOrder = orders.values().stream()
                .filter(order -> order.getNumber().equals(number))
                .findFirst();
        if (foundOrder.isPresent()) {
            return foundOrder.get();
        } else {
            throw new OrderDoesntExistException("Order number " + number + " doesn't exist.");
        }
    }
}