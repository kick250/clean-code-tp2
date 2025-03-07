package com.tp2.exercise3;

public class Order {
    private ClientBase client;

    public Order(ClientBase client) {
        this.client = client;
    }

    public String getClientName() {
        return client.getName();
    }
}