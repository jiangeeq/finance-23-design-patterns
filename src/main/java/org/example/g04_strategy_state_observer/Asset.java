package org.example.g04_strategy_state_observer;

import org.example.g04_strategy_state_observer.interfaces.AssetObserver;
import org.example.g04_strategy_state_observer.interfaces.AssetState;
import org.example.g04_strategy_state_observer.state.ActiveState;

import java.util.ArrayList;
import java.util.List;

public class Asset {
    private String name;
    // 状态机
    private AssetState state;
    // 观察者
    private List<AssetObserver> observers = new ArrayList<>();

    public Asset(String name) {
        this.name = name;
        this.state = new ActiveState();
    }

    public String getName() {
        return name;
    }

    public void setState(AssetState state) {
        this.state = state;
        notifyObservers();
    }

    public void addObserver(AssetObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (AssetObserver observer : observers) {
            observer.update(this);
        }
    }

    public void handle() {
        state.handle(this);
    }
}
