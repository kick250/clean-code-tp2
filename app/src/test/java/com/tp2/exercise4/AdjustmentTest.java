package com.tp2.exercise4;

import org.junit.Test;
import static org.junit.Assert.*;

public class AdjustmentTest {
    @Test
    public void test() {
        double startProductValue = 100.0;
        double valueWithDiscount = startProductValue - Adjustment.DISCOUNT_VALUE;
        Product product = new Product(startProductValue);
        Adjustment adjustment = new Adjustment();

        adjustment.applyDiscount(product);

        assertEquals(startProductValue, product.getValue(), 0.001) ;
        assertEquals(valueWithDiscount, product.getValueWithDiscount(), 0.001);
    }
}