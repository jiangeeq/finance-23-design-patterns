package org.example.c01_factory.account;

public class SavingsAccount  implements Account{
    @Override
    public void openAccount() {
        System.out.println("开启了储蓄账户");
    }
}
