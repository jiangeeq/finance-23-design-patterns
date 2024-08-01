package org.example.b15_interpreter.bank_rate_conversion;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConvertToMonthlyRate implements InterestRateExpression {
    private InterestRateExpression annualRate;

    public ConvertToMonthlyRate(InterestRateExpression annualRate) {
        this.annualRate = annualRate;
    }

    @Override
    public BigDecimal interpret(Context context) {
        return annualRate.interpret(context)
                .divide(BigDecimal.valueOf(12),2, RoundingMode.HALF_UP);
    }
}