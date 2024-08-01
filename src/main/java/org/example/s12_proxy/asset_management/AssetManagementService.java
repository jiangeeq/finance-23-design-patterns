package org.example.s12_proxy.asset_management;

import java.util.HashMap;
import java.util.Map;

// 实际对象：资产管理服务提供获取客户资产数据、提供投资建议、进行资产配置和执行投资决策等方法。
public class AssetManagementService {
    private Map<String, String> assetData;
    
    public AssetManagementService() {
        // 模拟数据库中的资产数据
        assetData = new HashMap<String, String>();
        assetData.put("001", "客户1高净值投资组合数据");
        assetData.put("002", "客户2高净值投资组合数据");
        assetData.put("111", "客户111高净值投资组合数据");
        assetData.put("222", "客户222高净值投资组合数据");
    }

    // 获取客户资产数据
    public String getAssetData(String userId) {
        String data = assetData.get(userId);
        System.out.println("获取客户资产数据: " + data);
        return data;
    }

    // 提供投资建议
    public String provideInvestmentAdvice(String userId) {

        System.out.println("提供投资建议: 定期投资计划" );
        return "提供投资建议 " + userId;
    }

    // 进行资产配置
    public String allocateAssets(String userId) {
        System.out.println("进行资产配置: 债券配置+股票配置+房地产配置" );
        return "进行资产配置 " + userId;
    }

    // 执行投资决策
    public String executeInvestmentDecision(String userId) {
        System.out.println("执行投资决策: 股票投资" );
        return "执行投资决策 " + userId;
    }
}
