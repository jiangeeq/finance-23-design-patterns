package org.example.b16_iterator;

import org.example.b16_iterator.aggregate.TransactionList;
import org.example.b16_iterator.domain.Account;
import org.example.b16_iterator.domain.Customer;
import org.example.b16_iterator.domain.Transaction;
import org.example.b16_iterator.interfaces.Iterator;

/**
 *
 * 迭代器模式是一种行为设计模式，它允许顺序访问一个聚合对象中的各个元素，而无需暴露其内部表示。
 * 在金融业务中，迭代器模式可以应用于多种场景，例如处理交易记录、遍历金融产品列表、处理投资组合等。
 *
 * 关键点：
 *      迭代器接口（Iterator）：定义访问和遍历元素的接口。
 *      具体迭代器（Concrete Iterator）：实现迭代器接口，并维护遍历过程中的当前位置。
 *      聚合接口（Aggregate）：定义创建迭代器的接口。
 *      具体聚合（Concrete Aggregate）：实现聚合接口，创建一个具体迭代器的实例。
 *
 * 应用场景: 1.使用迭代器模式遍历金融产品列表，筛选出符合客户需求的产品。
 *      2.银行管理系统通过迭代器模式遍历客户的所有账户，进行余额汇总。
 *      3.通过迭代器模式遍历每日交易记录，以便于生成日终报告。
 */
public class Main {
    public static void main(String[] args) {
        transactionList();
        accountList();
    }

    public static void transactionList() {
        Transaction t1 = new Transaction("T1", 100.0);
        Transaction t2 = new Transaction("T2", 200.0);
        Transaction t3 = new Transaction("T3", 300.0);
        Transaction t4 = new Transaction("T4", 400.0);
        Transaction t5 = new Transaction("T5", 500.0);


        TransactionList transactionList = new TransactionList(t1, t2, t3);
        transactionList.add(t4);
        transactionList.add(t5);
        transactionList.remove(t2);

        Iterator<Transaction> iterator = transactionList.createIterator();

        while (iterator.hasNext()) {
            Transaction transaction = iterator.next();
            System.out.println("Transaction ID: " + transaction.getId() + ", Amount: " + transaction.getAmount());
        }
    }

    public static void accountList(){
        Customer customer = new Customer("John Doe");
        customer.addAccount(new Account("A1", 1000.0));
        customer.addAccount(new Account("A2", 1500.0));
        customer.addAccount(new Account("A3", 2000.0));

        double totalBalance = calculateTotalBalance(customer);
        System.out.println("客户总余额 " + customer.getName() + ": " + totalBalance);
    }

    public static double calculateTotalBalance(Customer customer) {
        double totalBalance = 0.0;
        Iterator<Account> iterator = customer.getAccountList().createIterator();
        while (iterator.hasNext()) {
            Account account = iterator.next();
            totalBalance += account.getBalance();
        }
        return totalBalance;
    }
}