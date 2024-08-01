package org.example.s12_proxy.asset_management;

import java.util.HashSet;
import java.util.Set;

// 代理类：资产管理服务代理
// 包含对实际对象的引用，并通过权限控制和日志记录来增强功能。
public class AssetManagementProxy {
    private AssetManagementService assetManagementService;
    private Set<String> authorizedUserIds;
    private String userId;

    public AssetManagementProxy(AssetManagementService assetManagementService, String userId) {
        this.assetManagementService = assetManagementService;
        this.userId = userId;
        this.authorizedUserIds = new HashSet<>();
        // 添加授权客户
        this.authorizedUserIds.add("001");
        this.authorizedUserIds.add("002");
    }

    private boolean isAuthorized() {
        return authorizedUserIds.contains(userId);
    }

    // 获取客户资产数据
    public String getAssetData() {
        if (isAuthorized()) {
            logAccess(Thread.currentThread().getStackTrace()[1].getMethodName());
            String data = assetManagementService.getAssetData(userId);
            return data;
        } else {
            return "Unauthorized access";
        }
    }

    // 提供投资建议
    public String provideInvestmentAdvice() {
        if (isAuthorized()) {
            logAccess();
            String advice = assetManagementService.provideInvestmentAdvice(userId);
            return advice;
        } else {
            return "Unauthorized access";
        }
    }

    // 进行资产配置
    public String allocateAssets() {
        if (isAuthorized()) {
            logAccess();
            String allocation = assetManagementService.allocateAssets(userId);
            return allocation;
        } else {
            return "Unauthorized access";
        }
    }

    // 执行投资决策
    public String executeInvestmentDecision() {
        if (isAuthorized()) {
            logAccess();
            String decision = assetManagementService.executeInvestmentDecision(userId);
            return decision;
        } else {
            return "Unauthorized access";
        }
    }

    private void logAccess(String... methodName) {
        if(methodName != null && methodName.length > 0) {
            System.out.println("--用户 " + userId + " 进入method: " + methodName[0]);
        }else{
            System.out.println("--用户 " + userId + " 进入method: " + Thread.currentThread().getStackTrace()[2].getMethodName());
        }
    }
}
