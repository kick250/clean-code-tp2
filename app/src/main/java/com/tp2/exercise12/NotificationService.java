package com.tp2.exercise12;

public class NotificationService {
    public void sendNotification(NotificationType type) {
        switch (type) {
            case Email ignored:
                System.out.println("Enviando e-mail...");
                break;
            case SMS ignored:
                System.out.println("Enviando SMS...");
                break;
            case Push ignored:
                System.out.println("Enviando notificação push...");
                break;
        }
    }
}