package org.example.g04_strategy_state_observer.interfaces;
import org.example.g04_strategy_state_observer.Asset;

// 状态模式
public interface AssetState {
    void handle(Asset asset);
}
