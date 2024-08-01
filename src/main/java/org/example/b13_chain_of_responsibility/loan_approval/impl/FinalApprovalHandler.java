package org.example.b13_chain_of_responsibility.loan_approval.impl;

import org.example.b13_chain_of_responsibility.loan_approval.LoanRequest;
import org.example.b13_chain_of_responsibility.loan_approval.interfaces.LoanApprovalHandler;
// 最终审批处理
public class FinalApprovalHandler implements LoanApprovalHandler {
    private LoanApprovalHandler nextHandler;

    @Override
    public void setNextHandler(LoanApprovalHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(LoanRequest request) {
        System.out.println("最终审批处理: " + request.getApplicantName());
    }
}
