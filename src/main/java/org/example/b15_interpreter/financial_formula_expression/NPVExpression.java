package org.example.b15_interpreter.financial_formula_expression;

import java.math.BigDecimal;
import java.math.RoundingMode;

//非终结符表达式类（NPV）
public class NPVExpression implements FinancialExpression {
    private double discountRate;
    private FinancialExpression[] cashFlows;

    public NPVExpression(double discountRate, FinancialExpression... cashFlows) {
        this.discountRate = discountRate;
        this.cashFlows = cashFlows;
    }

    @Override
    public BigDecimal interpret(Context context) {
        BigDecimal npv = BigDecimal.ZERO;
        for (int i = 0; i < cashFlows.length; i++) {
            BigDecimal compound  = BigDecimal.valueOf(Math.pow(1 + discountRate, i + 1));
            BigDecimal result = cashFlows[i].interpret(context)
                    .divide(compound , 2, RoundingMode.HALF_UP);
            npv = npv.add(result);
        }
        return npv;
    }
}
