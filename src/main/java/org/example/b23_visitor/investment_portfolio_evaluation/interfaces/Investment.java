package org.example.b23_visitor.investment_portfolio_evaluation.interfaces;

// 元素接口
public interface Investment {
    void accept(Visitor visitor);
}
