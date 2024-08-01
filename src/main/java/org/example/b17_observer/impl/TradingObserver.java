package org.example.b17_observer.impl;

import org.example.b17_observer.interfaces.Observer;

public class TradingObserver implements Observer {
    @Override
    public void update(String marketData) {
        System.out.println("交易模块接收市场数据: " + marketData);
        // 实际处理市场数据的逻辑
    }
}
