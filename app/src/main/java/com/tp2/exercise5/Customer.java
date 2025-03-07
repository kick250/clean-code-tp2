package com.tp2.exercise5;

public class Customer {
    private int age;
    private double income;
    private int purchases;

    public Customer(int age, double income, int purchases) {
        this.age = age;
        this.income = income;
        this.purchases = purchases;
    }

    public int getAge() {
        return age;
    }

    public double getIncome() {
        return income;
    }

    public int getPurchases() {
        return 0;
    }

    public boolean isPremiumSenior() {
        return this.isSenior() && income > 5000 && purchases > 10;
    }

    public boolean isRegularSenior() {
        return this.isSenior() && income > 5000 && purchases <= 10;
    }

    public boolean isSeniorLowIncome() {
        return this.isSenior() && income <= 5000;
    }

    public boolean isPremiumYoung() {
        return this.isYoung() && income > 7000 && purchases > 20;
    }

    public boolean isRegularYoung() {
        return this.isYoung() && income > 7000 && purchases <= 20;
    }

    public boolean isYoungLowIncome() {
        return this.isYoung() && income <= 7000;
    }

    private boolean isSenior() {
        return age > 60;
    }

    private boolean isYoung() {
        return !this.isSenior();
    }
}