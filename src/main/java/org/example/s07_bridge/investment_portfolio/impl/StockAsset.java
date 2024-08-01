package org.example.s07_bridge.investment_portfolio.impl;

import org.example.s07_bridge.investment_portfolio.abstracts.Asset;

public class StockAsset implements Asset {
    @Override
    public void manage() {
        System.out.print("股票资产 ");
    }
}
