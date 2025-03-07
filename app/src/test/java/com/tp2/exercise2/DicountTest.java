package com.tp2.exercise2;

import org.junit.Test;
import static org.junit.Assert.*;

public class DicountTest {

    @Test
    public void whenValueIsGreaterThan1000_appliesDiscount() {
        Discount discount = new Discount();

        double value = 1001.0;

        assertNotEquals(value, discount.calculate(value));
    }

    @Test
    public void whenValueIsEqual1000_appliesDiscount() {
        Discount discount = new Discount();

        double value = 1000.0;

        assertNotEquals(value, discount.calculate(value));
    }

    @Test
    public void whenValueIsLessThan1000_doesNotApplyDiscount() {
        Discount discount = new Discount();

        double value = 999.0;

        assertEquals(value, discount.calculate(value), 0.001);
    }
}