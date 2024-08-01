package org.example.b13_chain_of_responsibility.loan_approval.impl;

import org.example.b13_chain_of_responsibility.loan_approval.LoanRequest;
import org.example.b13_chain_of_responsibility.loan_approval.interfaces.LoanApprovalHandler;
//风险评估处理
public class RiskAssessmentHandler implements LoanApprovalHandler {
    private LoanApprovalHandler nextHandler;

    @Override
    public void setNextHandler(LoanApprovalHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(LoanRequest request) {
        System.out.println("风险评估处理: " + request.getApplicantName());
        if (nextHandler != null) {
            System.out.println("执行下一处理" + nextHandler.getClass().getSimpleName());
            nextHandler.handleRequest(request);

        }
    }
}

