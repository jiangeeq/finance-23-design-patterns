package org.example.s12_proxy.proxy_factory.proxy;

import org.example.s12_proxy.proxy_factory.StockPriceService;
import org.example.s12_proxy.proxy_factory.domain.StockPrice;

import java.math.BigDecimal;
import java.util.*;

/**
 * 代理类
 * 实现了 StockPriceService 接口，并包含对实际对象的引用。
 * 维护一个缓存 priceCache 用于存储已获取的股票价格。
 * 在 getPrice 方法中，检查缓存中是否有数据，如果有则返回缓存的数据，否则从实际对象中获取数据并缓存。
 */
public class StockPriceServiceDBProxy implements StockPriceService {
    private StockPriceService target;
    private List<StockPrice> priceDB;

    public StockPriceServiceDBProxy(StockPriceService target) {
        this.target = target;
        priceDB = new ArrayList<>();
    }

    // 模拟从数据库获取数据，没有就插入
    @Override
    public BigDecimal getPrice(String stockSymbol) {
        // 模拟数据库select
        Optional<StockPrice> stockPrice = priceDB.stream()
                .filter(s -> s.getStockSymbol().equals(stockSymbol))
                .findFirst();
        if (stockPrice.isPresent()) {
            BigDecimal amount = stockPrice.get().getPrice();
            System.out.println("从DB返回股价: " + amount);
            return amount;
        } else {
            BigDecimal price = target.getPrice(stockSymbol);
            priceDB.add(new StockPrice(stockSymbol, price));
            return price;
        }
    }
}
