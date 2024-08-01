package org.example.s07_bridge.notify_system.impl;

import org.example.s07_bridge.notify_system.abstracts.NotificationChannel;

public class EmailChannel implements NotificationChannel {
    @Override
    public void deliver(String message) {
        System.out.println("Sending email with message: " + message);
    }
}
