package com.tp2.exercise8;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public boolean canBuy(double value) {
        return balance >= value;
    }

    public void buy(double value) throws InsufficientBalanceException {
        if (!this.canBuy(value)) throw new InsufficientBalanceException();

        this.balance -= value;
    }
}