package org.example.b16_iterator.aggregate;

import org.example.b16_iterator.domain.Transaction;
import org.example.b16_iterator.interfaces.Aggregate;
import org.example.b16_iterator.interfaces.Iterator;
import org.example.b16_iterator.iterator.TransactionIterator;

import java.util.Arrays;

public class TransactionList implements Aggregate<Transaction> {
    private Transaction[] array;

    public TransactionList(Transaction... transactions) {
        this.array = transactions;
    }

    public void add(Transaction transaction) {
        Transaction[] newArray = new Transaction[array.length + 1];  // 创建新的数组，长度比原数组大1
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];  // 复制原数组元素到新数组
        }
        newArray[newArray.length - 1] = transaction;  // 将要添加的元素放在新数组的最后位置
        this.array = newArray;
    }

    public void remove(Transaction transaction) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(transaction)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            Transaction[] newArray = new Transaction[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                // 遍历原数组 array，将不等于 index 的元素复制到新数组 newArray 中
                if (i != index) {
                    newArray[j++] = array[i];
                }
            }
            this.array = newArray;  // 更新原数组
        }
    }

    @Override
    public Iterator<Transaction> createIterator() {
        return new TransactionIterator(Arrays.stream(array).toList());
    }
}