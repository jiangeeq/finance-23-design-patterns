package org.example.c01_factory.account;

/**
 * 工厂模式（Factory Pattern）是一种常用的设计模式，用于创建对象的实例，而无需指定具体类的类型。
 * 通过工厂模式，系统可以在运行时根据具体需求动态地创建对象。
 *
 * 应用场景: 1.金融系统中通常会有多种类型的账户，如储蓄账户、支票账户、投资账户等。使用工厂模式可以根据用户的选择创建不同类型的账户实例。
        2. 不同的交易类型（如存款、取款、转账等）需要不同的处理逻辑。工厂模式可以根据交易类型创建相应的处理类实例。
        3. 金融系统需要生成多种报表，如账户报表、交易报表、财务报表等。使用工厂模式可以根据报表类型创建相应的报表生成器。
        4. 金融机构通常提供多种贷款产品，如个人贷款、房屋贷款、汽车贷款等。使用工厂模式可以根据客户需求创建不同类型的贷款对象。
        5. 金融业务中通常会涉及多种支付方式，如信用卡支付、借记卡支付、银行转账等。工厂模式可以用来动态创建不同类型的支付方式对象。
        6. 金融机构提供的理财产品种类繁多，如定期存款、基金、股票等。工厂模式可以用来根据需求创建不同类型的理财产品对象。
        7. 金融机构的客户可以是个人客户、公司客户或机构客户。工厂模式可以用来创建不同类型的客户对象，以便处理不同的业务需求。
 */
public class Main {
    public static void main(String[] args) {
        Account savings = AccountFactory.createAccount("SAVINGS");
        savings.openAccount();

        Account checking = AccountFactory.createAccount("CHECKING");
        checking.openAccount();
    }
}