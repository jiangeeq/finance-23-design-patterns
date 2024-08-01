package org.example.b14_command.impl;

import org.example.b14_command.interfaces.Order;

// 不同的股票交易操作实现
public class SellStock implements Order {
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }

    @Override
    public void undo() {
        stock.buy();
    }
}
