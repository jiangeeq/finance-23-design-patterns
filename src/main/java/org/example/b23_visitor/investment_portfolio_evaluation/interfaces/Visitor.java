package org.example.b23_visitor.investment_portfolio_evaluation.interfaces;

import org.example.b23_visitor.investment_portfolio_evaluation.domain.Bond;
import org.example.b23_visitor.investment_portfolio_evaluation.domain.Stock;

public interface Visitor {
    void visit(Stock stock);
    void visit(Bond bond);
}
