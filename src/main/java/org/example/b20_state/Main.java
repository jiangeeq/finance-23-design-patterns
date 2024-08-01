package org.example.b20_state;


/**
 *
 * 状态模式是一种行为设计模式，允许对象在内部状态改变时改变其行为，使其看起来像是改变了类。
 * 状态模式主要用来解决对象在多种状态之间切换时的行为变化问题，可以避免大量的条件分支语句（如 if 或 switch），提高代码的可维护性和扩展性。
 *
 * 关键点：
 *      状态（State）：定义一个接口，封装与上下文的一个特定状态相关的行为。
 *      具体状态（Concrete State）：实现状态接口，具体实现不同状态下的行为。
 *      上下文（Context）：维护一个具体状态类的实例，这个实例定义了当前的状态。
 *
 * 应用场景: 1.贷款审批系统：贷款申请可以有待审批、审批中、已批准、已拒绝、已放款等，每个状态对应不同的操作和行为。
 *      2.交易状态管理：交易可以有初始化、处理中、成功、失败等状态，每个状态对应不同的操作和行为。
 *      3.投资产品状态管理：投资产品可以有募集中、运行中、已结束等状态，每个状态对应不同的操作和行为。
 *      4.风险评估状态：风险评估可以有待评估、评估中、评估完成等状态，每个状态对应不同的操作和行为。
 */
public class Main {
    public static void main(String[] args) {
        LoanContext context = new LoanContext();

        // 处理贷款申请的不同状态
        context.processRequest(); // Loan is pending approval.
        context.processRequest(); // Loan is under review.
        context.processRequest(); // Loan has been approved.
        context.processRequest(); // Loan amount has been disbursed.
    }
}