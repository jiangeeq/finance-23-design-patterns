package org.example.s10_facade;

import org.example.s10_facade.service.AccountManagerServer;
import org.example.s10_facade.service.ComplianceCheckerServer;
import org.example.s10_facade.service.NotificationServer;
import org.example.s10_facade.service.RiskControllerServer;

// 外观类将子系统的复杂操作封装起来，对外提供一个简单的接口。
public class TransactionFacade {
    private AccountManagerServer accountManagerServer;
    private RiskControllerServer riskControllerServer;
    private ComplianceCheckerServer complianceCheckerServer;
    private NotificationServer notificationServer;

    public TransactionFacade() {
        this.accountManagerServer = new AccountManagerServer();
        this.riskControllerServer = new RiskControllerServer();
        this.complianceCheckerServer = new ComplianceCheckerServer();
        this.notificationServer = new NotificationServer();
    }
    // 包含了多个子系统处理的交易
    public void processTransaction() {
        System.out.println("---处理交易---");

        accountManagerServer.verifyAccount();
        riskControllerServer.performRiskCheck();
        complianceCheckerServer.performComplianceCheck();
        accountManagerServer.debitAccount();
        accountManagerServer.creditAccount();
        notificationServer.sendNotification();

        System.out.println("---交易完成---");
    }
}
