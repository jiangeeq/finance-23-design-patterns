package org.example.b13_chain_of_responsibility.loan_approval;

//贷款请求类
public class LoanRequest {
    private double amount;
    private String applicantName;

    public LoanRequest(double amount, String applicantName) {
        this.amount = amount;
        this.applicantName = applicantName;
    }

    public double getAmount() {
        return amount;
    }

    public String getApplicantName() {
        return applicantName;
    }
}
