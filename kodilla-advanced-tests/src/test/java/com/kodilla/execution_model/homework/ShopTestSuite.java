package com.kodilla.execution_model.homework;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {
    Shop shop = new Shop();
    Order order1 = new Order(107, LocalDate.of(2023,11,5));
    Order order2 = new Order(31, LocalDate.of(2022,3,26));
    Order order3 = new Order(42, LocalDate.of(2022,2,7));
    Order order4 = new Order(211, LocalDate.of(2024,1,15));


    @BeforeEach
    void addOrdersToShop() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
    }

    @Test
    void shouldAddOrderToShop() {
        assertEquals(4, shop.getOrdersSize());
    }

    @Test
    void shouldReturnOrdersTotalValue(){
        assertEquals(391, shop.ordersTotalValue());
    }

    @Test
    void shouldReturnOrderListFromValueRange(){
        List<Order> expectedOrders = new ArrayList<>();
        expectedOrders.add(order1);
        expectedOrders.add(order3);

        assertEquals(expectedOrders, shop.getOrdersFromValueRange(35, 150));
    }

    @Test
    void shouldReturnOrderListFromDateRange(){
        List<Order> expectedOrders = new ArrayList<>();
        expectedOrders.add(order2);
        expectedOrders.add(order3);

        assertEquals(expectedOrders, shop.getOrdersFromDateRange(LocalDate.of(2022,1,1),
                LocalDate.of(2023,1,1)));
    }
}
