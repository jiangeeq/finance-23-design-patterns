package org.example.s07_bridge.notify_system;


import org.example.s07_bridge.notify_system.abstracts.Notification;
import org.example.s07_bridge.notify_system.abstracts.NotificationChannel;
import org.example.s07_bridge.notify_system.impl.AlertNotification;
import org.example.s07_bridge.notify_system.impl.EmailChannel;
import org.example.s07_bridge.notify_system.impl.ReportNotification;
import org.example.s07_bridge.notify_system.impl.SMSChannel;

/**
 *
 * 桥接模式将一个类的抽象部分与它的实现部分分离，使它们都可以独立地变化。这通过组合（而不是继承）实现，使得一个类的多个维度可以独立扩展。
 *
 *
 * 应用场景: 1.通知系统：发送不同类型的通知（如邮件、短信）并支持不同的通知渠道。
 *      2. 在金融系统中，可能需要根据不同的金融产品使用不同的风险评估算法。通过桥接模式，可以将风险评估的抽象部分与具体的评分算法分离。
 *      3. 不同的投资组合可能包含不同类型的资产（如股票、债券、房地产）。通过桥接模式，可以将投资组合管理的抽象部分与具体的资产类型分离，使得可以灵活地组合和管理不同类型的资产。
 */
public class Main {
    public static void main(String[] args) {
        NotificationChannel email = new EmailChannel();
        NotificationChannel sms = new SMSChannel();

        Notification alertTip = new AlertNotification(email,sms);
        Notification reportTip = new ReportNotification(email);

        sendNotification(alertTip, "System Alert: High CPU usage");
        sendNotification(reportTip, "Monthly Financial Report");
    }
    public static void sendNotification(Notification notification, String message) {
        notification.send(message);
    }
}
