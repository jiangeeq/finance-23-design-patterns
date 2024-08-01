package org.example.b15_interpreter.bank_rate_conversion;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConvertToDailyRate implements InterestRateExpression {
    private InterestRateExpression annualRate;

    public ConvertToDailyRate(InterestRateExpression annualRate) {
        this.annualRate = annualRate;
    }

    @Override
    public BigDecimal interpret(Context context) {
        return annualRate.interpret(context)
                .divide(BigDecimal.valueOf(365),2, RoundingMode.HALF_UP);
    }
}
