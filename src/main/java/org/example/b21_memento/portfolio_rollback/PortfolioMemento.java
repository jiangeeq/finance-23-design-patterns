package org.example.b21_memento.portfolio_rollback;

import java.util.ArrayList;
import java.util.List;
// 备忘录类-快照副本实体
public class PortfolioMemento {
    //金融资产的集合
    private final List<String> assets;

    public PortfolioMemento(List<String> assets) {
        this.assets = new ArrayList<>(assets);
    }

    public List<String> getAssets() {
        return assets;
    }
}
