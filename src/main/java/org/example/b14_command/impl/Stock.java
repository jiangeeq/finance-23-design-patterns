package org.example.b14_command.impl;
// 命令具体执行者类-接收者类
public class Stock {
    private String name;
    private int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.println("买入 [ 股票: " + name + ", 份数: " + quantity + " ]");
    }

    public void sell() {
        System.out.println("卖出 [ 股票: " + name + ", 份数: " + quantity + " ]");
    }
}
