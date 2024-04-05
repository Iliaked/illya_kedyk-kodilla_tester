package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testGetOrder_withException() {
        Warehouse warehouse = new Warehouse();

        OrderDoesntExistException exception = assertThrows(OrderDoesntExistException.class, () -> {
            warehouse.getOrder("111");
        });

        assertEquals("Order number 111 doesn't exist.", exception.getMessage());
    }
}