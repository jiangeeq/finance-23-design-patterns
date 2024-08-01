package org.example.b21_memento.data_backup_recovery;

/**
 * 备忘录模式是一种行为设计模式，允许在不破坏封装性的前提下捕获和恢复对象的内部状态。
 * 备忘录模式主要用于保存和恢复对象的状态，使对象能够回到之前的某个状态。常见应用包括撤销操作、事务管理等。
 *
 * 关键点：
 *      备忘录（Memento）：存储原发器的内部状态。
 *      原发器（Originator）：创建一个含有当前内部状态的备忘录对象，并可以使用备忘录对象恢复其内部状态。
 *      负责人（Caretaker）：负责保存好备忘录，但不能对备忘录的内容进行操作或检查。
 *
 * 应用场景: 1.投资组合回退：在投资管理系统中，可以将投资组合的状态保存为备忘录，以便在错误操作后回退投资组合。
 *      2.数据备份与恢复：在数据管理系统中，可以将重要数据保存为备忘录，以便在数据损坏时进行恢复。
 *      3.策略回退：在交易策略系统中，可以将当前策略的状态保存为备忘录，以便在策略失误时回退到之前的状态。
 */
public class Main {
    public static void main(String[] args) {
        DataBackup dataBackup = new DataBackup();
        DataCaretaker caretaker = new DataCaretaker();

        // 设置数据并保存状态
        dataBackup.setData("我写了第一行内容");
        caretaker.saveState(dataBackup);

        dataBackup.setData("我把第一行内容改了");
        caretaker.saveState(dataBackup);

        System.out.println("Current Data: " + dataBackup);

        // 恢复到之前的状态
        int i = 1;  // 在循环开始前定义循环变量
        while (caretaker.getStackCount() > 0) {
            caretaker.restoreState(dataBackup);
            System.out.println("第" + i + "次恢复数据: " + dataBackup);
            i++;  // 在每次循环后递增 i
        }
    }
}