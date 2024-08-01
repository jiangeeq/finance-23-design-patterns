package org.example.c01_factory.account;

// 使用工厂可以根据用户的选择创建不同类型的账户实例。
public class AccountFactory {
    public static Account createAccount(String accountType) {
        if (accountType == null) {
            return null;
        }
        if (accountType.equalsIgnoreCase("SAVINGS")) {
            return new SavingsAccount();
        }
        if (accountType.equalsIgnoreCase("CHECKING")) {
            return new CheckingAccount();
        }
        return null;
    }
}
