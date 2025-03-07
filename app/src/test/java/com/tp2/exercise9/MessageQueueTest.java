package com.tp2.exercise9;

import org.junit.Test;
import static org.junit.Assert.*;

public class MessageQueueTest {
    @Test
    public void test() {
        String value = "test";
        MessageQueue messageQueue = new MessageQueue();
        messageQueue.add(value);

        assertEquals(value, messageQueue.getNextMessage());
        assertEquals(value, messageQueue.poll());
    }
}