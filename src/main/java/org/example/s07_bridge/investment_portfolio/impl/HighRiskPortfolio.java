package org.example.s07_bridge.investment_portfolio.impl;

import org.example.s07_bridge.investment_portfolio.abstracts.Asset;
import org.example.s07_bridge.investment_portfolio.abstracts.InvestmentPortfolio;

import java.util.List;

// 高风险投资组合
public class HighRiskPortfolio extends InvestmentPortfolio {
    public HighRiskPortfolio(List<Asset> assets) {
        super(assets);
    }
    @Override
    public void manageAsset() {
        System.out.print("高风险投资组合: ");
        assets.forEach(asset -> asset.manage());
        System.out.println();
    }
}
