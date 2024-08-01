package org.example.s07_bridge.notify_system.abstracts;

import java.util.List;

// 通知类型接口
public abstract class Notification {
    public List<NotificationChannel> channels;

    public abstract void send(String message);
}
