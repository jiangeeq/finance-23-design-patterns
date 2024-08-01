package org.example.b23_visitor.investment_portfolio_evaluation.domain;

// 具体元素：债券

import org.example.b23_visitor.investment_portfolio_evaluation.interfaces.Investment;
import org.example.b23_visitor.investment_portfolio_evaluation.interfaces.Visitor;

// 具体元素：债券
public class Bond  implements Investment {
    private String issuer;
    private double value;

    public Bond(String issuer, double value) {
        this.issuer = issuer;
        this.value = value;
    }

    public String getIssuer() {
        return issuer;
    }

    public double getValue() {
        return value;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
