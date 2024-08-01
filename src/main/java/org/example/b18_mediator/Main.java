package org.example.b18_mediator;


import org.example.b18_mediator.impl.BankTransferPayment;
import org.example.b18_mediator.impl.CreditCardPayment;
import org.example.b18_mediator.impl.ThirdPartyPayment;

/**
 *
 * 中介者模式是一种行为设计模式，用于减少对象之间的耦合。通过引入一个中介者对象，所有对象都通过中介者对象来进行通信，而不是彼此直接引用。
 * 通过使对象只与中介者对象交互，中介者模式减少了对象之间的依赖性，使对象之间的交互更加松散耦合。
 * 在金融业务中，中介者模式可以用于交易系统、支付系统等场景，简化组件之间的通信逻辑，提升系统的可维护性和扩展性。
 *
 * 关键点：
 *      中介者（Mediator）：定义对象之间通信的接口。
 *      具体中介者（Concrete Mediator）：实现中介者接口，协调各个同事对象之间的通信。
 *      同事类（Colleague）：定义与中介者通信的接口，持有中介者对象的引用。
 *      具体同事类（Concrete Colleague）：实现同事类接口，通过中介者对象与其他同事类进行通信。
 *
 * 应用场景: 1.支付系统：通过中介者协调各支付渠道（如银行转账、信用卡支付、第三方支付）之间的支付请求。
 *      2.投资组合管理系统：通过中介者协调投资组合的不同部分（如股票、债券、基金）之间的数据同步和交易决策。
 *      3.客户服务系统：通过中介者协调客户服务代表与不同后台系统（如订单系统、账户系统）的交互。
 *      4.结算系统：通过中介者协调不同参与方（如交易所、结算银行、投资者）之间的结算信息交换。
 */
public class Main {
    public static void main(String[] args) {
        // 创建具体中介者和同事类，并发起支付请求，通过中介者协调处理。
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        BankTransferPayment bankTransferPayment = new BankTransferPayment(paymentProcessor);
        CreditCardPayment creditCardPayment = new CreditCardPayment(paymentProcessor);
        ThirdPartyPayment thirdPartyPayment = new ThirdPartyPayment(paymentProcessor);

        paymentProcessor.setBankTransfer(bankTransferPayment);
        paymentProcessor.setCreditCardPayment(creditCardPayment);
        paymentProcessor.setThirdPartyPayment(thirdPartyPayment);

        bankTransferPayment.initiatePayment();
        creditCardPayment.initiatePayment();
        thirdPartyPayment.initiatePayment();
    }
}