package org.example.b17_observer;


import org.example.b17_observer.impl.InvestmentStrategyObserver;
import org.example.b17_observer.impl.MarketDataSubject;
import org.example.b17_observer.impl.RiskControlObserver;
import org.example.b17_observer.impl.TradingObserver;

/**
 *
 * 观察者模式是一种行为设计模式，它定义了一种一对多的依赖关系，使得当一个对象的状态发生变化时，其所有依赖者（观察者）都会收到通知并自动更新。
 * 在金融业务中，观察者模式可以用于许多场景，如市场行情更新、风险监控、账户余额变动通知等。
 *
 * 关键点：
 *      主题（Subject）：维护一组观察者，提供方法来增加和删除观察者，并在自身状态发生变化时通知所有观察者。
 *      观察者（Observer）：定义一个更新接口，以便主题在其状态发生变化时通知观察者。
 *      具体主题（Concrete Subject）：实现主题接口，并在内部状态发生变化时通知所有注册的观察者。
 *      具体观察者（Concrete Observer）：实现观察者接口，并在收到通知时进行相应的更新操作。
 *
 * 应用场景: 1.市场行情更新：金融系统发布市场行情变化，所有相关模块（如交易模块、风控模块）都会收到通知并做出响应。
 *      2.账户余额变动通知：当客户账户余额发生变动时，客户和银行系统的相关模块都会收到通知。
 *      3.风险监控：当市场风险指标发生变化时，风险监控系统会通知相关模块进行风险评估和处理。
 *      4.订单状态更新：当订单状态发生变化时，所有与订单相关的模块（如客户服务、物流）都会收到通知。
 */
public class Main {
    public static void main(String[] args) {
        // 创建具体主题和观察者，并注册观察者。当主题状态发生变化时，所有观察者都会收到通知并进行相应更新。
        MarketDataSubject marketDataSubject = new MarketDataSubject();

        TradingObserver tradingObserver = new TradingObserver();
        RiskControlObserver riskControlObserver = new RiskControlObserver();
        InvestmentStrategyObserver investmentStrategyObserver = new InvestmentStrategyObserver();

        marketDataSubject.addObserver(tradingObserver);
        marketDataSubject.addObserver(riskControlObserver);
        marketDataSubject.addObserver(investmentStrategyObserver);

        marketDataSubject.setMarketData("最新股价");
        marketDataSubject.setMarketData("外汇汇率更新");
    }
}