package org.example.g02_cor_strategy_templateMethod.interfaces;

import org.example.g02_cor_strategy_templateMethod.RiskRequest;

public abstract  class RiskHandler {
    protected RiskHandler nextHandler;

    public void setNextHandler(RiskHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract boolean handleRisk(RiskRequest request);
}
