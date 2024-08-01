package org.example.b20_state.impl;

import org.example.b20_state.LoanContext;
import org.example.b20_state.LoanState;

// 已放款状态，只打印状态信息。
public class DisbursedState implements LoanState {
    @Override
    public void handleRequest(LoanContext context) {
        System.out.println("Loan amount has been disbursed.");
    }
}
