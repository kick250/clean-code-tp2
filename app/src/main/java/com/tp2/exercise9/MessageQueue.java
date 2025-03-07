package com.tp2.exercise9;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueue {
    private Queue<String> messages = new LinkedList<>();

    public void add(String value) {
        messages.add(value);
    }

    public String getNextMessage() {
        return messages.peek();
    }

    public String poll() {
        return  messages.poll();
    }
}