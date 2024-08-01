package org.example.b14_command.interfaces;
// 股票交易命令接口
public interface Order {
    // 执行操作
    void execute();
    // 取消操作
    void undo();
}
