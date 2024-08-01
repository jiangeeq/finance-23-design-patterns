package org.example.g03_templateMethod_composite_decorator;

import org.example.g03_templateMethod_composite_decorator.abstracts.ReportGenerator;
import org.example.g03_templateMethod_composite_decorator.composite.ReportComposite;
import org.example.g03_templateMethod_composite_decorator.composite.ReportLeaf;
import org.example.g03_templateMethod_composite_decorator.decorator.ChartDecorator;
import org.example.g03_templateMethod_composite_decorator.decorator.ReportDecorator;

/**
 *  报表生成系统
 *
 * 使用设计模式：
 *      模板方法模式：定义报表生成的基本流程。
 *      组合模式：处理复杂的报表结构。
 *      装饰者模式：动态地添加报表的功能。
 */
public class Main {
    public static void main(String[] args) {
        // 组合多个命令成一个命令
        ReportComposite composite = new ReportComposite();
        composite.addComponent(new ReportLeaf("Header"));
        composite.addComponent(new ReportLeaf("Body"));
        composite.addComponent(new ReportLeaf("Footer"));
        // 采用装饰对组合添加功能
        ReportDecorator chartDecorator = new ChartDecorator(composite);

        ReportGenerator generator = new FinancialReportGenerator(chartDecorator);
        generator.generateReport();
    }
}
