package org.example.s07_bridge.notify_system.impl;

import org.example.s07_bridge.notify_system.abstracts.Notification;
import org.example.s07_bridge.notify_system.abstracts.NotificationChannel;

import java.util.List;

public class ReportNotification extends Notification {

    public ReportNotification(NotificationChannel... channel) {
        super.channels = List.of(channel);
    }
    @Override
    public void send(String message) {
        System.out.println("发送报表通知");
        for (NotificationChannel channel : super.channels) {
            channel.deliver(message);
        }

    }
}
