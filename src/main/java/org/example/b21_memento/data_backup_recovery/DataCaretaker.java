package org.example.b21_memento.data_backup_recovery;

import java.util.Stack;

// 负责人类
public class DataCaretaker {
    private Stack<DataMemento> mementoStack = new Stack<>();

    public void saveState(DataBackup dataBackup) {
        mementoStack.push(dataBackup.save());
    }

    public void restoreState(DataBackup dataBackup) {
        if (!mementoStack.isEmpty()) {
            dataBackup.restore(mementoStack.pop());
        }
    }
    public int getStackCount(){
        return mementoStack.size();
    }
}
