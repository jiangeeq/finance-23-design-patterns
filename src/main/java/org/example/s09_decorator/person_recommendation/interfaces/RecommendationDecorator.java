package org.example.s09_decorator.person_recommendation.interfaces;

// 推荐装饰器基类
public abstract class RecommendationDecorator implements Recommendation {
    protected Recommendation recommendation;

    public RecommendationDecorator(Recommendation recommendation) {
        this.recommendation = recommendation;
    }

    @Override
    public void recommend() {
        recommendation.recommend();
    }
}
