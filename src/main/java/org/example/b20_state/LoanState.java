package org.example.b20_state;

// 状态接口
public interface LoanState {
    // 定义了一个方法 handleRequest，用于处理不同状态下的请求。
    void handleRequest(LoanContext context);
}
