package org.example.s07_bridge.investment_portfolio.impl;

import org.example.s07_bridge.investment_portfolio.abstracts.Asset;
import org.example.s07_bridge.investment_portfolio.abstracts.InvestmentPortfolio;
import org.example.s07_bridge.risk_assessment_and_score.abstracts.RiskAssessment;

import java.util.List;
// 低风险投资组合
public class LowRiskPortfolio extends InvestmentPortfolio {
    public LowRiskPortfolio(List<Asset> assets) {
        super(assets);
    }

    @Override
    public void manageAsset() {
        System.out.print("低风险投资组合: ");
        assets.forEach(Asset::manage);
        System.out.println();

    }
}
