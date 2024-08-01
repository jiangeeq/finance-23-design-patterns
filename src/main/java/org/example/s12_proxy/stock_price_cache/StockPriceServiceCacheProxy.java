package org.example.s12_proxy.stock_price_cache;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

// 代理类：带缓存的股票价格服务
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
