package org.example.b20_state.impl;

import org.example.b20_state.LoanContext;
import org.example.b20_state.LoanState;

// 已批准状态，处理请求后转到 DisbursedState
public class ApprovedState implements LoanState {
    @Override
    public void handleRequest(LoanContext context) {
        System.out.println("Loan has been approved.");
        context.setState(new DisbursedState());
    }
}