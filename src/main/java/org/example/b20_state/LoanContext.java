package org.example.b20_state;

import org.example.b20_state.impl.PendingState;

// 贷款审批状态上下文，维护一个状态实例，提供设置状态和处理请求的方法。
public class LoanContext {
    private LoanState state;

    public LoanContext() {
        state = new PendingState(); // 默认状态为待审批
    }

    public void setState(LoanState state) {
        this.state = state;
    }

    public void processRequest() {
        state.handleRequest(this);
    }
}
