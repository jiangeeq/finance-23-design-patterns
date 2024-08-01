package org.example.c04_prototype;

/**
 * 原型模式（Prototype Pattern）是一种创建型设计模式，通过复制现有对象来创建新对象，而不是通过实例化一个类来创建对象。
 * 这对于创建代价高昂或复杂的对象非常有用。原型模式在金融业务中的应用可以极大地提高系统的性能和灵活性，尤其是在处理复杂对象的快速创建和修改时。
 *
 *
 * 应用场景: 1.交易订单的快速创建和修改：在金融交易系统中，交易订单往往包含大量的配置和属性。通过原型模式，可以快速复制现有订单并进行修改，以创建新的订单。
        2. 账户配置：不同类型的账户可能有相似的配置，通过原型模式可以快速创建不同配置的账户实例。
        3. 报表生成：生成复杂的金融报表时，可以基于模板报表进行快速复制和修改。
 */
public class Main {
    public static void main(String[] args) {
        // 创建一个初始订单
        Order originalOrder = new Order("12345", "AAPL", 100, 150.0);
        System.out.println("初始Order: " + originalOrder);

        // 克隆订单并修改部分属性
        Order clonedOrder = originalOrder.clone();
        clonedOrder.setOrderId("12346");
        clonedOrder.setQuantity(200);
        System.out.println("克隆后修改的订单Order: " + clonedOrder);

        // 另一个克隆订单
        Order anotherClonedOrder = originalOrder.clone();
        anotherClonedOrder.setOrderId("12347");
        anotherClonedOrder.setSymbol("GOOG");
        System.out.println("另一个克隆后修改的订单Order: " + anotherClonedOrder);
    }
}
