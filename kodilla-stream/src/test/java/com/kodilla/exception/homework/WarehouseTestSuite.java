package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testGetOrder_withException() {
        Warehouse warehouse = new Warehouse();
        boolean exceptionThrown = false;

        try {
            warehouse.getOrder("111");
        } catch (OrderDoesntExistException e) {
            exceptionThrown = true;
            assertEquals("Order number 111 doesn't exist.", e.getMessage());
        }

        assertTrue(exceptionThrown, "Expected OrderDoesntExistException to be thrown.");
    }
}