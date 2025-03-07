package com.tp2.exercise2;

public class Discount {
    private static final double MIN_PRICE = 1000.0;
    private static final double DISCOUNT_PORCENTAGE = 0.9;

    public double calculate(double price) {
        if (this.hasMinValue(price))
            return this.applyDiscount(price);

        return price;
    }

    private boolean hasMinValue(double price) {
        return price >= MIN_PRICE;
    }

    private double applyDiscount(double price) {
        return price * DISCOUNT_PORCENTAGE;
    }
}