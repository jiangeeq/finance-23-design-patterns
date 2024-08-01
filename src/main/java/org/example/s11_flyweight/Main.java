package org.example.s11_flyweight;


import org.example.s10_facade.TransactionFacade;

import java.math.BigDecimal;

/**
 *
 * 享元模式（Flyweight Pattern）是一种结构型设计模式，通过共享大量细粒度对象来减少内存消耗，提高系统性能。
 * 享元模式主要用于解决大量相似对象的内存开销问题。它将相同部分提取出来进行共享，不同部分则保留在对象内部，以此来减少内存的使用。
 *
 * 关键点：
 *      1.共享对象：通过共享相同的对象来减少内存开销。
 *      2.内外状态：将对象的状态分为内部状态和外部状态。内部状态是共享的，不随环境变化；外部状态是每次操作时传递的，会随环境变化。
 *      3.工厂方法：使用工厂方法来管理和创建享元对象，确保共享对象的唯一性。
 *      4.减少内存消耗：通过共享机制，有效减少系统中对象的数量，降低内存消耗，提高性能。
 *
 * 应用场景: 1.将股票的静态信息（如股票代码、公司名称等）作为内部状态共享，动态信息（如交易价格、交易量等）作为外部状态。
 *      2.银行系统中管理着大量的客户信息，有些信息（如姓名、身份证号）是共享的，有些信息（如账户余额）是动态的。
 *      3.金融产品，每个产品都有相似的属性，如利率、期限等的固定属性作为内部状态共享。客户购买信息作为外部状态处理。
 *      4.系统中记录大量的交易日志，将交易类型、交易状态等作为内部状态共享，具体的交易时间、交易金额等作为外部状态处理。
 */
public class Main {
    public static void main(String[] args) {
        StockFactory stockFactory = new StockFactory();

        ConcreteStock alibaba = stockFactory.getStock("200123", "阿里巴巴");
        ConcreteStock alimama = stockFactory.getStock("200123", "阿里妈妈");
        ConcreteStock baidu = stockFactory.getStock("112343", "百度");

        alibaba.trade("buy", BigDecimal.valueOf(100));
        alimama.trade("sell", BigDecimal.valueOf(50));
        baidu.trade("buy", BigDecimal.valueOf(200));

        System.out.println(alibaba == alimama); // 输出 true，表示共享同一个对象
        System.out.println(alibaba == baidu); // 输出 false，表示不同的对象

    }
}
