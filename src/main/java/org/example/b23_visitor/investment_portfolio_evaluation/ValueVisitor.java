package org.example.b23_visitor.investment_portfolio_evaluation;


import org.example.b23_visitor.investment_portfolio_evaluation.domain.Bond;
import org.example.b23_visitor.investment_portfolio_evaluation.domain.Stock;
import org.example.b23_visitor.investment_portfolio_evaluation.interfaces.Visitor;

// 具体访问者：评估投资组合价值
public class ValueVisitor implements Visitor {
    private double totalValue = 0;

    @Override
    public void visit(Stock stock) {
        totalValue += stock.getValue();
    }

    @Override
    public void visit(Bond bond) {
        totalValue += bond.getValue();
    }

    public double getTotalValue() {
        return totalValue;
    }
}

