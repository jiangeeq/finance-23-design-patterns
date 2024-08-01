package org.example.s12_proxy.proxy_factory;

import org.example.s12_proxy.proxy_factory.proxy.StockPriceServiceCacheProxy;
import org.example.s12_proxy.proxy_factory.proxy.StockPriceServiceDBProxy;
import org.example.s12_proxy.proxy_factory.domain.StockPriceServiceImpl;

// 代理工厂类：用于创建股票价格服务的代理
public class StockPriceServiceProxyFactory {

    public static StockPriceServiceCacheProxy createCacheProxy() {
        StockPriceServiceImpl realService = new StockPriceServiceImpl();
        return new StockPriceServiceCacheProxy(realService);
    }

    public static StockPriceServiceDBProxy createDBProxy() {
        StockPriceServiceImpl realService = new StockPriceServiceImpl();
        return new StockPriceServiceDBProxy(realService);
    }
}
