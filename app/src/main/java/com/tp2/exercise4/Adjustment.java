package com.tp2.exercise4;

public class Adjustment {
    public static final double DISCOUNT_VALUE = 10.0;

    public void applyDiscount(Product product) {
        product.applyDiscount(DISCOUNT_VALUE);
    }
}