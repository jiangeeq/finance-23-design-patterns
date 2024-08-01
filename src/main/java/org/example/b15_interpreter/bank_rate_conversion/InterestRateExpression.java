package org.example.b15_interpreter.bank_rate_conversion;


import java.math.BigDecimal;

//利率转换接口
public interface InterestRateExpression {
    // 解释
    BigDecimal interpret(Context context);
}
