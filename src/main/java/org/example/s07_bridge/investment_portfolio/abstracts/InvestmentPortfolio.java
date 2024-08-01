package org.example.s07_bridge.investment_portfolio.abstracts;

import java.util.List;

// 投资组合抽象类
public abstract class InvestmentPortfolio {
    protected List<Asset> assets;
    public InvestmentPortfolio(List<Asset> assets) {
        this.assets = assets;
    }

    // 管理的资产
    public abstract void manageAsset();
}
