package org.example.b15_interpreter.financial_formula_expression;



import java.math.BigDecimal;
import java.math.RoundingMode;

public class IRRExpression implements FinancialExpression {
    private FinancialExpression[] cashFlows;

    public IRRExpression(FinancialExpression... cashFlows) {
        this.cashFlows = cashFlows;
    }

    @Override
    public BigDecimal interpret(Context context) {
        double irr = 0.1; // 初始猜测值
        BigDecimal increment = BigDecimal.valueOf(0.0001);
        BigDecimal npv;
        do {
            npv = BigDecimal.valueOf(0);
            for (int i = 0; i < cashFlows.length; i++) {
                BigDecimal compound = BigDecimal.valueOf(Math.pow(1 + irr, i + 1));
                BigDecimal result = cashFlows[i].interpret(context)
                        .divide(compound, 2, RoundingMode.HALF_UP);
            }
            irr = irr + increment.doubleValue();
        } while (npv.compareTo(BigDecimal.valueOf(0)) > 0 );
        return increment.subtract(BigDecimal.valueOf(irr)); // 回退到最接近0的利率
    }
}
