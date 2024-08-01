package org.example.s12_proxy.proxy_factory.domain;



import org.example.s12_proxy.proxy_factory.StockPriceService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

// 实际对象：股票价格服务实现
public class StockPriceServiceImpl implements StockPriceService {
    private Map<String, StockPrice> stockPrices;

    public StockPriceServiceImpl() {
        // 模拟第三方接口中的股票价格数据
        stockPrices = new HashMap<>();
        stockPrices.put("alibaba", new StockPrice("alibaba", BigDecimal.valueOf(150.0)));
        stockPrices.put("alimama",  new StockPrice("alimama",BigDecimal.valueOf(2800.0)));
        stockPrices.put("baidu",  new StockPrice("baidu",BigDecimal.valueOf(3400.0)));
        // 添加更多模拟数据
    }
    @Override
    public BigDecimal getPrice(String stockSymbol) {
        BigDecimal amount = stockPrices.get(stockSymbol).getPrice();
        System.out.println("http获取到 "+stockSymbol+ " 股价: " + amount);
        return amount;
    }
}
