package org.example.b15_interpreter.financial_formula_expression;

import java.math.BigDecimal;

//抽象表达式接口
public interface FinancialExpression {
    BigDecimal interpret(Context context);
}
