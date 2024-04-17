package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Shop {
    private Set<Order> orders = new HashSet<>();

    public static void main(String[] args) {
        Shop shop = new Shop();
        Order order1 = new Order(107, LocalDate.of(2023,11,5));
        Order order2 = new Order(31, LocalDate.of(2022,3,26));
        Order order3 = new Order(42, LocalDate.of(2022,2,7));
        Order order4 = new Order(211, LocalDate.of(2024,1,15));

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);

        List<Order> listOfOrders = shop.getOrdersFromDateRange(LocalDate.of(2022, 1, 4),
                LocalDate.of(2023, 6, 6));


        for (Order order : listOfOrders) {
            System.out.println(order);
        }
        System.out.println("Values from all orders: " + shop.ordersTotalValue());
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public int getOrdersSize() {
        return orders.size();
    }

    public int ordersTotalValue() {
        int totalValue = 0;
        for (Order order : orders) {
            totalValue += order.getOrderValue();
        }
        return totalValue;
    }

    public List<Order> getOrdersFromValueRange(int value1, int value2) {
        List<Order> ordersByValue = new ArrayList<>();
        for (Order order : orders) {
            if (value1 < order.getOrderValue() && order.getOrderValue() < value2 ){
                ordersByValue.add(order);
            }
        }
        return ordersByValue;
    }

    public List<Order> getOrdersFromDateRange(LocalDate date1, LocalDate date2) {
        List<Order> ordersByDate = new ArrayList<>();
        for (Order order : orders) {
            if (order.getOrderDate().isAfter(date1) && order.getOrderDate().isBefore(date2)) {
                ordersByDate.add(order);
            }
        }
        return ordersByDate;
    }
}
