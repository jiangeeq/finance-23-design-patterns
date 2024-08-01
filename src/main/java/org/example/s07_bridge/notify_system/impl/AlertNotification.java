package org.example.s07_bridge.notify_system.impl;

import org.example.s07_bridge.notify_system.abstracts.Notification;
import org.example.s07_bridge.notify_system.abstracts.NotificationChannel;

import java.util.List;

// 报警通知
public class AlertNotification extends Notification {

    public AlertNotification(NotificationChannel... channel) {
        super.channels = List.of(channel);
    }

    @Override
    public void send(String message) {
        System.out.println("发送报警通知");
        for (NotificationChannel channel : super.channels) {
            channel.deliver(message);
        }
    }
}
