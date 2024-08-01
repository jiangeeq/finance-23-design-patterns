package org.example.g01_strategy_templateMethod_observer.transaction_process.interfaces;
// 观察者模式

import org.example.g01_strategy_templateMethod_observer.transaction_process.domain.Trade;

public interface TradeObserver {
    void update(Trade trade);
}
