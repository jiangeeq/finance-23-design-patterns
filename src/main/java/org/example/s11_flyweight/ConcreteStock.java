package org.example.s11_flyweight;

import java.math.BigDecimal;

// 具体股票实现
public class ConcreteStock  {
    private String stockCode;
    private String companyName;

    public ConcreteStock(String stockCode, String companyName) {
        this.stockCode = stockCode;
        this.companyName = companyName;
    }

    public void trade(String tradeType, BigDecimal amount) {
        System.out.println("交易类型： " + tradeType + " 股票代码: " + stockCode + " (" + companyName + ") 的 股价: " + amount);

    }
}
