package org.example.s07_bridge.risk_assessment_and_score.impl;

import org.example.s07_bridge.risk_assessment_and_score.abstracts.RiskAssessment;

// 基于市场数据的评估算法
public class MarketDataRiskAssessment implements RiskAssessment {
    @Override
    public int assessRisk() {
        int score = 50;
        System.out.println("通过查询第三方市场数据分析到评分为 "+score);
        return score;
    }
}
