package org.example.b21_memento.data_backup_recovery;

// 原发器类
public class DataBackup {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public DataMemento save() {
        return new DataMemento(data);
    }

    public void restore(DataMemento memento) {
        this.data = memento.getData();
    }

    @Override
    public String toString() {
        return "数据备份的{" +
                "数据='" + data + '\'' +
                '}';
    }
}

