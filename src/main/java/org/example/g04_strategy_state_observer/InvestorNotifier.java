package org.example.g04_strategy_state_observer;

import org.example.g04_strategy_state_observer.interfaces.AssetObserver;

public class InvestorNotifier implements AssetObserver {
    public void update(Asset asset) {
        System.out.println("通知投资者有关资产的情况: " + asset.getName());
    }
}
