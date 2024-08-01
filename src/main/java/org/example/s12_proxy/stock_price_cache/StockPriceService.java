package org.example.s12_proxy.stock_price_cache;

import java.math.BigDecimal;

// 股票价格服务接口
public interface StockPriceService {
    BigDecimal getPrice(String stockSymbol);
}
