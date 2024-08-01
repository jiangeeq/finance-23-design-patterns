package org.example.b14_command;

import org.example.b14_command.impl.BuyStock;
import org.example.b14_command.impl.SellStock;
import org.example.b14_command.impl.Stock;

/**
 *
 * 命令模式（Command Pattern）是一种行为设计模式，它将请求封装成一个对象，
 * 从而使你可以用不同的请求对客户进行参数化、对请求进行排队或记录日志，以及支持可撤销的操作。
 *
 * 关键点：
 *      命令：将操作封装成对象，使得不同的请求、队列、日志等都可以使用同一接口。
 *      调用者：发出请求，但不直接实现具体操作。
 *      接收者：实际执行具体操作的对象。
 *      可撤销：可以实现命令的撤销和重做功能。
 *
 * 应用场景: 1.客户发出买入或卖出股票的命令，交易系统接收并执行这些命令，同时可以撤销未成交的订单。
 *      2.银行工作人员发出贷款发放命令，系统处理并记录贷款发放流程，支持贷款取消或变更。
 */
public class Main {
    public static void main(String[] args) {
        Stock abcStock = new Stock("ABC", 10);

        OrderManager broker = new OrderManager();
        broker.takeOrder(new BuyStock(abcStock));
        broker.takeOrder(new SellStock(abcStock));
        broker.takeOrder(new SellStock(abcStock));

        broker.placeOrders();
        broker.undoLastOrder();
    }
}