package org.example.b17_observer.interfaces;
// 观察者接口：定义了 update 方法，当主题的状态发生变化时，观察者将被通知并进行更新。
public interface Observer {
    void update(String marketData);
}
