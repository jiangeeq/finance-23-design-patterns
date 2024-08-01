package org.example.b21_memento.portfolio_rollback;

import java.util.ArrayList;
import java.util.List;
//原发器类
public class Portfolio {
    // 资产组合
    private List<String> assets = new ArrayList<>();

    public void addAsset(String asset) {
        assets.add(asset);
    }

    public void removeAsset(String asset) {
        assets.remove(asset);
    }
    // 保存资产
    public PortfolioMemento save() {
        return new PortfolioMemento(assets);
    }
    // 恢复资产（就是取出内容）
    public void restore(PortfolioMemento memento) {
        assets = memento.getAssets();
    }

    @Override
    public String toString() {
        return "投资组合的具体资产项目{" +
                "项目=" + assets +
                '}';
    }
}
