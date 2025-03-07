package com.tp2.exercise10;

public class Monitoring {
    private int accessCount = 0;

    public int getAccessCount() {
        return accessCount;
    }

    public void sumAccess() {
        accessCount++;
    }
}