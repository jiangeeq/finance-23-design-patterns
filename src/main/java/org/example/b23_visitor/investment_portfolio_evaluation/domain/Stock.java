package org.example.b23_visitor.investment_portfolio_evaluation.domain;
import org.example.b23_visitor.investment_portfolio_evaluation.interfaces.Investment;
import org.example.b23_visitor.investment_portfolio_evaluation.interfaces.Visitor;


// 具体元素：股票
public class Stock implements Investment {
    private String ticker;
    private double value;

    public Stock(String ticker, double value) {
        this.ticker = ticker;
        this.value = value;
    }

    public String getTicker() {
        return ticker;
    }

    public double getValue() {
        return value;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

