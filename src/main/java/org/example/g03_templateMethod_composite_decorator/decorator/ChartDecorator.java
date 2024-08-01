package org.example.g03_templateMethod_composite_decorator.decorator;

import org.example.g03_templateMethod_composite_decorator.abstracts.ReportComponent;

// 图标功能-装饰
public class ChartDecorator extends ReportDecorator {
    public ChartDecorator(ReportComponent decoratedReport) {
        super(decoratedReport);
    }

    public void display() {
        super.display();
        System.out.println("向报表添加图表...");
    }
}
