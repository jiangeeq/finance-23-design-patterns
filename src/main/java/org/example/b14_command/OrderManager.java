package org.example.b14_command;

import org.example.b14_command.interfaces.Order;

import java.util.ArrayList;
import java.util.List;
// 具体命令处理器类
public class OrderManager {
    private List<Order> orderList = new ArrayList<>();
    // 添加命令
    public void takeOrder(Order order) {
        orderList.add(order);
    }
    // 执行接受的命令
    public void placeOrders()  {
        System.out.println("执行接受的命令");
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
    // 撤销接受到的命令
    public void undoLastOrder() {
        if (!orderList.isEmpty()) {
            System.out.println("撤销接受到的命令");
            Order lastOrder = orderList.remove(orderList.size() - 1);
            lastOrder.undo();
        }else{
            System.out.println("没有需要撤销的命令");
        }
    }
}