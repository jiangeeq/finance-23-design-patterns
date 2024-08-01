package org.example.c03_singleton;

/**
 * 单例模式是一种创建型设计模式，确保一个类只有一个实例，并提供一个全局访问点。单例模式在金融业务中有多种应用场景，
 * 特别是在需要控制资源访问、共享全局状态或者确保特定操作仅执行一次的情况下。
 *
 * 关键点
 * 单例模式的实现方式主要有饿汉式和懒汉式两种。
 *  饿汉式在类加载时就创建实例，线程安全。
 *  懒汉式在第一次使用时才创建实例，可以使用同步锁或双重检查锁定来确保线程安全。
 *  双重检查锁定的懒汉式单例模式通过 volatile+双重判断+synchronized 解决并发
 *
 * 应用场景: 1.在金融系统中，日志管理器需要统一记录和管理系统日志。
        2. 在一个金融系统中，配置管理器需要统一管理系统的各种配置参数，如数据库连接配置、API密钥等。
 */
public class Main {
    public static void main(String[] args) {
        ConfigManager config = ConfigManager.getInstance();
        String dbUrl = config.getProperty("spring.datasource.url");
        String password = config.getProperty("spring.datasource.password");

        System.out.println("Database URL: " + dbUrl);
        System.out.println("password: " + password);
    }
}
