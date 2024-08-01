package org.example.b21_memento.portfolio_rollback;

import java.util.Stack;
//负责人类
public class PortfolioCaretaker {
    private Stack<PortfolioMemento> mementoStack = new Stack<>();
    // 往栈中压入原发器
    public void saveState(Portfolio portfolio) {
        mementoStack.push(portfolio.save());
    }
    // 往栈中压入原发器
    public void restoreState(Portfolio portfolio) {
        if (!mementoStack.isEmpty()) {
            portfolio.restore(mementoStack.pop());
        }
    }
}

