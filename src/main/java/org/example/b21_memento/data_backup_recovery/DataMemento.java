package org.example.b21_memento.data_backup_recovery;

// 备忘录类
public class DataMemento {
    private final String data;

    public DataMemento(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}

