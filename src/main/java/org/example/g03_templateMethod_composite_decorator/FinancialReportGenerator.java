package org.example.g03_templateMethod_composite_decorator;

import org.example.g03_templateMethod_composite_decorator.abstracts.ReportGenerator;
import org.example.g03_templateMethod_composite_decorator.decorator.ReportDecorator;

public class FinancialReportGenerator extends ReportGenerator {
    private ReportDecorator reportDecorator;

   public FinancialReportGenerator(ReportDecorator reportDecorator) {
       this.reportDecorator = reportDecorator;
   }

    protected void collectData() {
        System.out.println("Collecting financial data...");
    }

    protected void processData() {
        System.out.println("Processing financial data...");
    }

    protected void formatReport() {
        System.out.println("Formatting financial report...");
    }

    protected void printReport() {
        this.reportDecorator.display();
        super.printReport();
    }
}

