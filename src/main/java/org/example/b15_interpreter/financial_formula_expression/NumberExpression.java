package org.example.b15_interpreter.financial_formula_expression;

import java.math.BigDecimal;

public class NumberExpression implements FinancialExpression {
    private BigDecimal number;

    public NumberExpression(BigDecimal number) {
        this.number = number;
    }

    @Override
    public BigDecimal interpret(Context context) {
        return number;
    }
}
