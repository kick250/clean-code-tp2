package com.tp2.exercise11;

import org.junit.Test;
import static org.junit.Assert.*;

public class OrderServiceTest {

    @Test
    public void test() {
        OrderService orderService = new OrderService();

        orderService.updateStatus(new Pending());
        orderService.updateStatus(new Processing());
        orderService.updateStatus(new Sent());
        orderService.updateStatus(new Delivered());
    }
}