package com.tp2.exercise4;

public class Product {
    private double value;
    private double discountApplied;

    public Product(double value) {
        this.value = value;
        this.discountApplied = 0.0;
    }

    public void applyDiscount(double discountValue) {
        discountApplied = discountValue;
    }

    public double getValue() {
        return value;
    }

    public double getValueWithDiscount() {
        return value - discountApplied;
    }
}