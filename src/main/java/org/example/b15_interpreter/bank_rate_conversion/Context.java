package org.example.b15_interpreter.bank_rate_conversion;

import java.math.BigDecimal;
import java.util.Map;

public class Context {
    private Map<String, BigDecimal> retes;

    public Context(Map<String, BigDecimal> retes) {
        this.retes = retes;
    }

    public BigDecimal getRate(String bank) {
        return retes.getOrDefault(bank, BigDecimal.valueOf(0.0));
    }
}
