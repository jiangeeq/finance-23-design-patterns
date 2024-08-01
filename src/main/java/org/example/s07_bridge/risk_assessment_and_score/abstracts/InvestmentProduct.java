package org.example.s07_bridge.risk_assessment_and_score.abstracts;

import org.example.s07_bridge.risk_assessment_and_score.impl.FinancialProduct;

// 理财投资产品
public class InvestmentProduct extends FinancialProduct {
    public InvestmentProduct(RiskAssessment riskAssessment) {
        super(riskAssessment);
    }

    @Override
    public void performRiskAssessment() {
        int score = riskAssessment.assessRisk();
        System.out.print("理财投资产品风险指数: " + (score > 60 ? "优秀" : "良好"));
    }
}
