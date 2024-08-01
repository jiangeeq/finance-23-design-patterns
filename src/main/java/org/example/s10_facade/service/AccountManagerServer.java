package org.example.s10_facade.service;

// 子系统A：账户管理
public class AccountManagerServer {
    public void verifyAccount() {
        System.out.println("账户验证");
    }

    public void debitAccount() {
        System.out.println("账户借记");
    }

    public void creditAccount() {
        System.out.println("账户贷记");
    }
}

