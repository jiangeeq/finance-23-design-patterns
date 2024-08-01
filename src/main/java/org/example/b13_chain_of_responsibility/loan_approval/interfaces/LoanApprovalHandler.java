package org.example.b13_chain_of_responsibility.loan_approval.interfaces;

import org.example.b13_chain_of_responsibility.loan_approval.LoanRequest;

public interface LoanApprovalHandler {
    void setNextHandler(LoanApprovalHandler nextHandler);
    void handleRequest(LoanRequest request);
}
