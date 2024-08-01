package org.example.c05_constructor;

/**
 *
 * 构造器模式（Builder Pattern）是一种创建型设计模式，它将一个复杂对象的构建过程与其表示分离，使得同样的构建过程可以创建不同的表示。
 * 这种模式特别适合构建包含多个组成部分且各部分可以灵活变化的对象。
 *
 *  关键点
 *  通过定义一个构建对象的接口来构建复杂对象，并允许通过逐步构建的方式创建对象，而不需要直接调用复杂对象的构造函数。
 *
 * 应用场景: 1.交易请求生成：生成包含多个参数和配置的复杂交易请求。
        2. 账户配置：创建复杂的账户配置，包含多种属性和设置。
        3. 投资组合构建：创建包含多个投资产品的复杂投资组合。
        4. 报表生成：生成复杂的金融报表，包含多个部分，如标题、正文、统计数据等。
 */
public class Main {
    public static void main(String[] args) {
        // 使用构造器模式创建交易请求对象
        TradeRequest tradeRequest = new TradeRequest.Builder()
                .withOrderId("12345")
                .withAccountNumber("ACC123")
                .withSymbol("AAPL")
                .withQuantity(100)
                .withPrice(150.0)
                .withOrderType("Buy")
                .withTimeInForce("GTC")
                .build();
        System.out.println(tradeRequest);

        // 创建另一个交易请求对象
        TradeRequest anotherTradeRequest = new TradeRequest.Builder()
                .withOrderId("12346")
                .withQuantity(200)
                .withPrice(2500.0)
                .withOrderType("Sell")
                .withTimeInForce("IOC")
                .build();
        System.out.println(anotherTradeRequest);
    }
}
