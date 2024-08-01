package org.example.b16_iterator.interfaces;

// 聚合接口
public interface Aggregate<E> {
    Iterator<E> createIterator();
}
