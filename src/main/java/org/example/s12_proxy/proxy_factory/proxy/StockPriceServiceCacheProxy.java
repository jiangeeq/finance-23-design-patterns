package org.example.s12_proxy.proxy_factory.proxy;

import org.example.s12_proxy.proxy_factory.StockPriceService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
/**
 * 代理类
 * 实现了 StockPriceService 接口，并包含对实际对象的引用。
 * 维护一个缓存 priceCache 用于存储已获取的股票价格。
 * 在 getPrice 方法中，检查缓存中是否有数据，如果有则返回缓存的数据，否则从实际对象中获取数据并缓存。
 */
public class StockPriceServiceCacheProxy implements StockPriceService {
    private StockPriceService target;
    private Map<String, BigDecimal> priceCache;

    public StockPriceServiceCacheProxy(StockPriceService target) {
        this.target = target;
        priceCache = new HashMap<String, BigDecimal>();
    }

    @Override
    public BigDecimal getPrice(String stockSymbol) {
        if (priceCache.containsKey(stockSymbol)) {
            BigDecimal amount = priceCache.get(stockSymbol);
            System.out.println("从缓存返回股价: " + amount);
            return amount;
        } else {
            BigDecimal price = target.getPrice(stockSymbol);
            priceCache.put(stockSymbol, price);
            return price;
        }
    }
}
