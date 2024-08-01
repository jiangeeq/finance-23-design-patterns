package org.example.s09_decorator.person_recommendation.impl;

import org.example.s09_decorator.person_recommendation.interfaces.Recommendation;
import org.example.s09_decorator.person_recommendation.interfaces.RecommendationDecorator;

// 历史交易装饰类
public class TransactionHistoryDecorator extends RecommendationDecorator {
    public TransactionHistoryDecorator(Recommendation decoratedRecommendation) {
        super(decoratedRecommendation);
    }

    @Override
    public void recommend() {
        super.recommend();
        addTransactionHistory();
    }

    private void addTransactionHistory() {
        System.out.println("根据交易历史添加推荐。");
    }
}
