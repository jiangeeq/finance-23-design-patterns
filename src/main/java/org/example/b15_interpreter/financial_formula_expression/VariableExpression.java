package org.example.b15_interpreter.financial_formula_expression;

import java.math.BigDecimal;

public class VariableExpression implements FinancialExpression {
    private String name;

    public VariableExpression(String name) {
        this.name = name;
    }

    @Override
    public BigDecimal interpret(Context context) {
        return context.getVariableValue(name);
    }
}