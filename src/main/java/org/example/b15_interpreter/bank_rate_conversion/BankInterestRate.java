package org.example.b15_interpreter.bank_rate_conversion;

import java.math.BigDecimal;

// 终结符表达式类
public class BankInterestRate implements InterestRateExpression {
    private String bank;

    public BankInterestRate(String bank) {
        this.bank = bank;
    }

    @Override
    public BigDecimal interpret(Context context) {
        return context.getRate(bank);
    }
}
