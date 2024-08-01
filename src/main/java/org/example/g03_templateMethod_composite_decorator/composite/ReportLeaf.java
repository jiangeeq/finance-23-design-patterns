package org.example.g03_templateMethod_composite_decorator.composite;

import org.example.g03_templateMethod_composite_decorator.abstracts.ReportComponent;

//报告行叶-组合
public class ReportLeaf  implements ReportComponent {
    private String name;

    public ReportLeaf(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("显示报告组件: " + name);
    }
}
