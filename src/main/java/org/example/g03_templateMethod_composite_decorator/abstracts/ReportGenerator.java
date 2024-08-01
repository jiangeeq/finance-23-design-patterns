package org.example.g03_templateMethod_composite_decorator.abstracts;
// 模板方法模式
public abstract class ReportGenerator {
    public final void generateReport() {
        collectData();
        processData();
        formatReport();
        printReport();
    }

    protected abstract void collectData();
    protected abstract void processData();
    protected abstract void formatReport();

    protected void printReport() {
        System.out.println("打印报告...");
    }
}
