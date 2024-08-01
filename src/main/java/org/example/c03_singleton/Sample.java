package org.example.c03_singleton;

/**
 * 单例模式的实现方式主要有饿汉式和懒汉式两种。
 */
public class Sample {
}

// 饿汉式在类加载时就创建实例，线程安全。
class SingltonHungry{
    private static final SingltonHungry INSTANCE = new SingltonHungry();
    // 私有构造函数，防止外部实例化
    private SingltonHungry() {}
    public static SingltonHungry getInstance(){
        return INSTANCE;
    }
}


// 懒汉式在第一次使用时才创建实例，可以使用同步锁或双重检查锁定来确保线程安全。
class SingletonLazy{
    private static SingletonLazy instance;
    // 私有构造函数，防止外部实例化
    private SingletonLazy() {}

    public static synchronized SingletonLazy getInstance(){
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}

// 双重检查锁定的懒汉式单例模式：
class SingletonLazySafe{
    private static volatile SingletonLazySafe instance;
    // 私有构造函数，防止外部实例化
    private SingletonLazySafe() {}

    public static  SingletonLazySafe getInstance(){
        if (instance == null) {
            synchronized (SingletonLazySafe.class) {
                if (instance == null) {
                    instance = new SingletonLazySafe();
                }
            }
        }
        return instance;
    }
}

