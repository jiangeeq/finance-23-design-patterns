package org.example.g01_strategy_templateMethod_observer.transaction_process.domain;

public class Trade {
    private String symbol;
    private int amount;

    public Trade(String symbol, int amount) {
        this.symbol = symbol;
        this.amount = amount;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "symbol='" + symbol + '\'' +
                ", amount=" + amount +
                '}';
    }
}
