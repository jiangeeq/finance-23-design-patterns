package org.example.b17_observer.impl;

import org.example.b17_observer.interfaces.Observer;
import org.example.b17_observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;
//实现了主题接口，维护一个观察者列表，并在状态发生变化时通知所有观察者。
public class MarketDataSubject implements Subject {
    private List<Observer> observers;
    private String marketData;

    public MarketDataSubject() {
        this.observers = new ArrayList<>();
    }

    public void setMarketData(String marketData) {
        this.marketData = marketData;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(marketData);
        }
    }
}
