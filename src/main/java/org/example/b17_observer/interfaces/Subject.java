package org.example.b17_observer.interfaces;
//定义了添加、删除观察者和通知观察者的方法。
public interface  Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
