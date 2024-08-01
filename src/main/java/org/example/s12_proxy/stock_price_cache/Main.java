package org.example.s12_proxy.stock_price_cache;


/**
 *
 * 代理模式提供了一个类代替另一个类的功能。代理类通常会对实际对象的操作进行预处理或后处理，控制对实际对象的访问。
 *  --使用接口可以增加代码的灵活性和可扩展性，尤其是在面向对象编程中，通过接口定义服务可以方便替换和扩展实现。
 *
 * 关键点：
 *      1.代理类：实现与实际对象相同的接口，包含对实际对象的引用。
 *      2.实际对象：被代理的真实对象，实际执行操作的对象。
 *      3.控制访问：代理类可以在调用实际对象的方法前后进行额外的处理，比如权限验证、日志记录等。
 *
 * 应用场景: 1.资产管理经理/平台为高净值客户提供资产管理服务，包括投资建议、资产配置,客户资产数据的获取、分析以及投资决策的执行。
 *      2.外汇交易平台为投资者提供外汇交易服务，包括实时报价和交易执行。作为外汇交易平台的代理类，负责接收和处理交易指令，并管理外汇市场数据的访问和缓存。
 *      3.缓存代理，在股票基金行情系统中，需要缓存频繁访问的股票价格信息。代理类在首次访问时获取数据并缓存，后续访问直接返回缓存数据。
 *      4.系统中记录大量的交易日志，将交易类型、交易状态等作为内部状态共享，具体的交易时间、交易金额等作为外部状态处理。
 */
public class Main {
    public static void main(String[] args) {
        StockPriceService stockPriceService = new StockPriceServiceImpl();
        StockPriceService proxy = new StockPriceServiceCacheProxy(stockPriceService);

        // 第一次访问，缓存未命中
        queryStockPrice("alibaba", proxy);
        // 第二次访问，缓存命中
        queryStockPrice("alibaba", proxy);
        // 第一次访问，缓存未命中
        queryStockPrice("baidu", proxy);
        // 第二次访问，缓存命中
        queryStockPrice("baidu", proxy);
    }

    public static void queryStockPrice(String stockSymbol, StockPriceService proxy) {
        System.out.println("客户查询"+stockSymbol +" 股价");
        proxy.getPrice(stockSymbol);
    }
}
