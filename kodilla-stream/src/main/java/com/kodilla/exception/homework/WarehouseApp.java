package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("1234"));
        warehouse.addOrder(new Order("3850"));

        try {
            Order order = warehouse.getOrder("4444");
            System.out.println("Order: " + order.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println(e.getMessage());
        }
    }
}
