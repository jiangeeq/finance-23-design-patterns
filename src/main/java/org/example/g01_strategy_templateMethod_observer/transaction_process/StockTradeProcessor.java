package org.example.g01_strategy_templateMethod_observer.transaction_process;

import org.example.g01_strategy_templateMethod_observer.transaction_process.domain.Trade;
import org.example.g01_strategy_templateMethod_observer.transaction_process.interfaces.TradingStrategy;

public class StockTradeProcessor extends BaseTradeProcessor {
    private TradingStrategy strategy;

    public StockTradeProcessor(TradingStrategy strategy) {
        this.strategy = strategy;
    }

    protected void validateTrade(Trade trade) {
        System.out.println("验证股票交易...");
    }

    protected void executeTrade(Trade trade) {
        strategy.executeTrade(trade);
    }
}
