package com.tp2.exercise8;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void whenCanBuy() {
        BankAccount account = new BankAccount(100.0);

        assertTrue(account.canBuy(90.0));
    }

    @Test
    public void whenCanNotBuy() {
        BankAccount account = new BankAccount(10.0);

        assertFalse(account.canBuy(90));
    }


    @Test
    public void whenValueIsValid() {
        BankAccount account = new BankAccount(100.0);

        boolean success;
        try {
            account.buy(90.0);
            success = true;
        } catch (Exception e) {
            success = false;
        }

        assertTrue(success);
    }

    @Test
    public void whenValueIsInvalid() {
        BankAccount account = new BankAccount(10.0);

        assertThrows(InsufficientBalanceException.class, () -> {
            account.buy(90.0);
        });
    }
}