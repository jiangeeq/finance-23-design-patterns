package org.example.c01_factory.account;

public class CheckingAccount implements Account{
    @Override
    public void openAccount() {
        System.out.println("开启了支票账户");
    }
}
