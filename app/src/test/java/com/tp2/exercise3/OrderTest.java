package com.tp2.exercise3;

import org.junit.Test;
import static org.junit.Assert.*;

public class OrderTest {

    @Test
    public void whenClientIsNotNull_returnsClientName() {
        String name = "Ana";
        Order order = new Order(new Client(name));
        assertEquals(name, order.getClientName());
    }

    @Test
    public void whenClientIsNullObject_returnsEmptyString() {
        Order order = new Order(new ClientNull());
        assertEquals("", order.getClientName());
    }
}