package org.example.s06_adapter.customer_data_convert.domain;

// 定义新系统的客户数据类
public class NewSystemCustomer {
    private String name;
    private String email;
    private String phoneNumber;

    // 构造函数和getter/setter方法
    public NewSystemCustomer(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "NewSystemCustomer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
