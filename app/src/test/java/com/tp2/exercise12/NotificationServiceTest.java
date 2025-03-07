package com.tp2.exercise12;

import org.junit.Test;
import static org.junit.Assert.*;

public class NotificationServiceTest {
    @Test
    public void test() {
        NotificationService service = new NotificationService();

        service.sendNotification(new Email());
        service.sendNotification(new SMS());
        service.sendNotification(new Push());
    }
}