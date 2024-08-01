package org.example.s06_adapter.customer_data_convert;

import org.example.s06_adapter.customer_data_convert.domain.NewSystemCustomer;
import org.example.s06_adapter.customer_data_convert.domain.OldSystemCustomer;

// 实现数据转换适配器(组合实现方式)
public class CustomerAdapter {
    private OldSystemCustomer oldCustomer;

    public CustomerAdapter(OldSystemCustomer oldCustomer) {
        this.oldCustomer = oldCustomer;
    }

    public NewSystemCustomer getNewSystemCustomer() {
        String[] contactDetails = oldCustomer.getContactInfo().split(",");
        return new NewSystemCustomer(oldCustomer.getFullName(), contactDetails[0], contactDetails[1]);
    }
}
