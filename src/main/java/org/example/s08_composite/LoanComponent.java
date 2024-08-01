package org.example.s08_composite;

import java.math.BigDecimal;

// 借贷项目组件接口
public interface LoanComponent {

    void showDetails();


    BigDecimal getAmount();
}
