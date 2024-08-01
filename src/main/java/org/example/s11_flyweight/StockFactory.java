package org.example.s11_flyweight;

import java.util.HashMap;
import java.util.Map;

// 股票工厂类
public class StockFactory {
    private Map<String, ConcreteStock> stockPool = new HashMap<>();

    public ConcreteStock getStock(String stockCode, String companyName) {
        ConcreteStock stock = stockPool.get(stockCode);
        if (stock == null) {
            stock = new ConcreteStock(stockCode, companyName);
            stockPool.put(stockCode, stock);
        }
        return stock;
    }
}
