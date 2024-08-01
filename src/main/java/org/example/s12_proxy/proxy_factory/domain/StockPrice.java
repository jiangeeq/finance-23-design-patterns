package org.example.s12_proxy.proxy_factory.domain;

import java.math.BigDecimal;

public class StockPrice{
    private BigDecimal price;
    private String stockSymbol;
    public StockPrice(String stockSymbol, BigDecimal price) {
        this.price = price;
        this.stockSymbol = stockSymbol;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }
}
