package org.example.s06_adapter.customer_data_convert.domain;

// 定义旧系统的客户数据类
public class OldSystemCustomer {
    private String fullName;
    private String contactInfo;

    // 构造函数和getter/setter方法
    public OldSystemCustomer(String fullName, String contactInfo) {
        this.fullName = fullName;
        this.contactInfo = contactInfo;
    }

    public String getFullName() {
        return fullName;
    }

    public String getContactInfo() {
        return contactInfo;
    }
}
