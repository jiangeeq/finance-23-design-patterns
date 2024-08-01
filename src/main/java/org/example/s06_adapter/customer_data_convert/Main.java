package org.example.s06_adapter.customer_data_convert;

import org.example.s06_adapter.customer_data_convert.domain.NewSystemCustomer;
import org.example.s06_adapter.customer_data_convert.domain.OldSystemCustomer;

/**
 *
 * 适配器模式（Adapter Pattern）是一种结构型设计模式，它允许将一个接口转换成客户希望的另一个接口，使得原本由于接口不兼容而不能一起工作的类可以协同工作。
 * 适配器模式在金融业务中有多种应用场景，特别是在系统集成、数据转换和第三方服务接入方面。
 *
 *  关键点
 *  适配器模式通过将一个类的接口转换成客户端所期待的另一个接口，使得原本由于接口不兼容而不能一起工作的类可以协同工作。
 *  它主要分为两种形式：对象适配器（通过组合方式）和类适配器（通过继承方式）。
 *
 * 应用场景: 1.系统集成：将老旧系统的接口适配到新的系统接口中，实现平滑过渡和集成。
 2. 数据转换：在不同格式的数据之间进行转换，使得系统能够处理多种格式的数据。(在金融系统中，不同模块或服务之间可能需要进行数据交换，而这些数据格式可能不一致。例如，从一个老旧系统导出的客户数据格式与新系统所要求的格式不同，需要进行数据转换。)
 3. 第三方服务接入：将第三方服务的接口适配为系统内部的标准接口，方便系统调用。(金融系统，需要集成多个第三方支付网关，如PayPal、Stripe和Square等。不同支付网关的接口不同，通过适配器模式，我们可以将这些不同的接口适配为系统统一的接口。)
 */
public class Main {
    public static void main(String[] args) {
        // 旧系统的客户数据
        OldSystemCustomer oldCustomer = new OldSystemCustomer("John Doe", "john.doe@example.com,555-1234");

        // 通过适配器转换为新系统的客户数据
        CustomerAdapter adapter = new CustomerAdapter(oldCustomer);
        NewSystemCustomer newCustomer = adapter.getNewSystemCustomer();

        // 输出新系统的客户数据
        System.out.println(newCustomer);
    }
}
