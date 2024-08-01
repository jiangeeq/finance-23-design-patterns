package org.example.g02_cor_strategy_templateMethod.chains;

import org.example.g02_cor_strategy_templateMethod.RiskRequest;
import org.example.g02_cor_strategy_templateMethod.interfaces.RiskHandler;

public class CreditCheckHandler extends RiskHandler {
    public boolean handleRisk(RiskRequest request) {
        System.out.println("chain-进行信用检查...");
        if (nextHandler != null) {
            nextHandler.handleRisk(request);
        }
        return true;
    }
}