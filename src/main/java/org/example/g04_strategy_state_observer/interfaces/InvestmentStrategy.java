package org.example.g04_strategy_state_observer.interfaces;

import org.example.g04_strategy_state_observer.Asset;

// 策略模式
public interface InvestmentStrategy {
    void invest(Asset asset);
}
