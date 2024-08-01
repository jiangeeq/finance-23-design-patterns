package org.example.b21_memento.portfolio_rollback;


/**
 *
 *
 * 备忘录模式是一种行为设计模式，允许在不破坏封装性的前提下捕获和恢复对象的内部状态。
 * 备忘录模式主要用于保存和恢复对象的状态，使对象能够回到之前的某个状态。常见应用包括撤销操作、事务管理等。
 *
 * 关键点：
 *      备忘录（Memento）：备忘录就像是一个保存数据的快照。想象一下，当你玩游戏时，你可以在某个时刻保存游戏进度，备忘录就类似于这个保存点，记录了你当时的游戏状态。
 *      原发器（Originator）：创建一个含有当前内部状态的备忘录对象，并可以使用备忘录对象恢复其内部状态。
 *      负责人（Caretaker）：负责保存好备忘录，但不能对备忘录的内容进行操作或检查。
 *
 * 场景举例:
 * 假设你在写一篇文章，突然想到要保存一下当前的内容，以防以后需要撤销改动。这时可以用备忘录模式来帮助你。
 *      备忘录（Memento）：你保存的文档快照，记录了当前的文章内容。
 *      原发器（Originator）：你是文章的作者，可以随时保存当前文章状态，并在需要时恢复到之前保存的状态。
 *      负责人（Caretaker）：你的电脑或一个文件管理系统，它保存你的文档快照，但不会去查看或修改文档内容。它只负责保存和提供你需要的快照。
 *
 * 应用场景: 1.投资组合回退：在投资管理系统中，可以将投资组合的状态保存为备忘录，以便在错误操作后回退投资组合。
 *      2.数据备份与恢复：在数据管理系统中，可以将重要数据保存为备忘录，以便在数据损坏时进行恢复。
 *      3.策略回退：在交易策略系统中，可以将当前策略的状态保存为备忘录，以便在策略失误时回退到之前的状态。
 */
public class Main {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio();
        PortfolioCaretaker caretaker = new PortfolioCaretaker();

        // 添加资产并保存状态
        portfolio.addAsset("Stock A");
        caretaker.saveState(portfolio);

        portfolio.addAsset("Bond B");
        caretaker.saveState(portfolio);

        System.out.println("当前投资组合: " + portfolio);

        // 恢复到之前的状态
        caretaker.restoreState(portfolio);
        System.out.println("恢复投资组合: " + portfolio);

        caretaker.restoreState(portfolio);
        System.out.println("恢复投资组合: " + portfolio);

        caretaker.restoreState(portfolio);
        System.out.println("恢复投资组合: " + portfolio);
    }
}