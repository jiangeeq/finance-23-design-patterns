package org.example.g01_strategy_templateMethod_observer.transaction_process;

import org.example.g01_strategy_templateMethod_observer.transaction_process.domain.Trade;
import org.example.g01_strategy_templateMethod_observer.transaction_process.interfaces.TradeObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseTradeProcessor {
    private List<TradeObserver> observers = new ArrayList<>();

    public final void processTrade(Trade trade) {
        validateTrade(trade);
        executeTrade(trade);
        recordTrade(trade);
        notifyObservers(trade);
    }

    protected abstract void validateTrade(Trade trade);
    protected abstract void executeTrade(Trade trade);

    private void recordTrade(Trade trade) {
        System.out.println("记录交易 " + trade.getAmount() + " 单位 " + trade.getSymbol());
    }

    private void notifyObservers(Trade trade) {
        // 通知观察者
        observers.forEach(observer -> observer.update(trade));
    }

    public void removeObserver(TradeObserver observer) {
        observers.remove(observer);
   }

    public void addObserver(TradeObserver observer) {
        observers.add(observer);
    }
}
