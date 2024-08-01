package org.example.g04_strategy_state_observer.state;

import org.example.g04_strategy_state_observer.Asset;
import org.example.g04_strategy_state_observer.interfaces.AssetState;

public class FrozenState implements AssetState {
    public void handle(Asset asset) {
        System.out.println("Asset is frozen: " + asset.getName());
    }
}