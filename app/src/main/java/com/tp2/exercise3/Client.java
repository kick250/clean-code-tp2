package com.tp2.exercise3;

public class Client extends ClientBase {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}