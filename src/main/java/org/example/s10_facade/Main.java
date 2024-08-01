package org.example.s10_facade;


/**
 *
 * 外观模式（Facade Pattern）是一种结构型设计模式，它通过提供一个统一的接口，来简化和集成子系统中的复杂接口，使得子系统更加容易使用。
 * 外观模式可以将复杂的子系统封装在一个类中，对外提供简单的接口。
 *
 * 关键点：
 *      1.简化接口：外观模式提供一个高层接口，简化了子系统的使用。
 *      2.松耦合：外观模式将客户端与复杂的子系统分离，减少了系统间的耦合。
 *      3.便于维护：通过引入外观模式，可以更容易地管理和维护子系统。
 *      4.增强可读性：外观模式提供了更清晰的接口，使代码更具可读性和可理解性。
 *
 * 应用场景: 1.交易处理,交易系统对接多个子系统，如账户系统、风险控制系统、合规检查系统等。外观类封装交易处理的各个步骤，对外提供简单的交易处理接口。
 *      2.贷款申请流程,客户通过一个接口申请贷款，系统会自动进行信用评估、风险评估和审批。
 *      3.风险管理,系统对客户进行综合风险管理，包括信用风险、市场风险和操作风险等。
 */
public class Main {
    public static void main(String[] args) {
        TransactionFacade transactionFacade = new TransactionFacade();
        transactionFacade.processTransaction();
    }
}
