package org.example.b15_interpreter.financial_formula_expression;

import java.math.BigDecimal;
import java.util.Map;

public class Context {
    private Map<String, BigDecimal> variables;

    public Context(Map<String, BigDecimal> variables) {
        this.variables = variables;
    }

    public BigDecimal getVariableValue(String name) {
        return variables.getOrDefault(name, BigDecimal.valueOf(0.0));
    }
}