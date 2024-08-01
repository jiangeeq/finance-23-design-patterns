package org.example.s07_bridge.risk_assessment_and_score;

import org.example.s07_bridge.risk_assessment_and_score.impl.FinancialProduct;
import org.example.s07_bridge.risk_assessment_and_score.abstracts.InvestmentProduct;
import org.example.s07_bridge.risk_assessment_and_score.abstracts.RiskAssessment;
import org.example.s07_bridge.risk_assessment_and_score.impl.CreditScoreRiskAssessment;
import org.example.s07_bridge.risk_assessment_and_score.impl.LoanProduct;
import org.example.s07_bridge.risk_assessment_and_score.impl.MarketDataRiskAssessment;


/**
 *
 * 桥接模式将一个类的抽象部分与它的实现部分分离，使它们都可以独立地变化。这通过组合（而不是继承）实现，使得一个类的多个维度可以独立扩展。
 *
 *
 * 应用场景: 1.通知系统：发送不同类型的通知（如邮件、短信）并支持不同的通知渠道。
 *      2. 在金融系统中，可能需要根据不同的金融产品使用不同的风险评估算法。通过桥接模式，可以将风险评估的抽象部分与具体的评分算法分离。
 *      3. 不同的投资组合可能包含不同类型的资产（如股票、债券、房地产）。通过桥接模式，可以将投资组合管理的抽象部分与具体的资产类型分离，使得可以灵活地组合和管理不同类型的资产。
 */
public class Main {
    public static void main(String[] args) {
        // 创建具体的评分算法
        RiskAssessment creditScoreAssessment = new CreditScoreRiskAssessment();
        RiskAssessment marketDataAssessment = new MarketDataRiskAssessment();

        // 贷款产品需要检查用户的信用评分
        FinancialProduct loanProduct = new LoanProduct(creditScoreAssessment);
        // 投资类产品需要检查市场趋势指数评分
        FinancialProduct investmentProduct = new InvestmentProduct(marketDataAssessment);

        // 输出该产品风险评估结果
        loanProduct.performRiskAssessment();
        investmentProduct.performRiskAssessment();
    }
}
