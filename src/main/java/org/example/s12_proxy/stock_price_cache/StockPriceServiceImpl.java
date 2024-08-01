package org.example.s12_proxy.stock_price_cache;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

// 实际对象：股票价格服务实现
public class StockPriceServiceImpl implements StockPriceService {
    private Map<String, BigDecimal> stockPrices;

    public StockPriceServiceImpl() {
        // 模拟第三方接口中的股票价格数据
        stockPrices = new HashMap<>();
        stockPrices.put("alibaba", BigDecimal.valueOf(150.0));
        stockPrices.put("alimama", BigDecimal.valueOf(2800.0));
        stockPrices.put("baidu", BigDecimal.valueOf(3400.0));
        // 添加更多模拟数据
    }
    @Override
    public BigDecimal getPrice(String stockSymbol) {
        BigDecimal amount = stockPrices.get(stockSymbol);
        System.out.println("http获取到 "+stockSymbol+ " 股价: " + amount);
        return amount;
    }
}
