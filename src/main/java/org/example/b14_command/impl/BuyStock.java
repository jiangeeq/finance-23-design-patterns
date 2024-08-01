package org.example.b14_command.impl;

import org.example.b14_command.interfaces.Order;

public class BuyStock implements Order {
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }

    @Override
    public void undo() {
        stock.sell();
    }
}