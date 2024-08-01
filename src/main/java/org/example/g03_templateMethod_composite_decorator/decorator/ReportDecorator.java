package org.example.g03_templateMethod_composite_decorator.decorator;

import org.example.g03_templateMethod_composite_decorator.abstracts.ReportComponent;

// 抽象装饰者模式
public abstract class ReportDecorator implements ReportComponent {
    protected ReportComponent decoratedReport;

    public ReportDecorator(ReportComponent decoratedReport) {
        this.decoratedReport = decoratedReport;
    }

    public void display() {
        decoratedReport.display();
    }
}

