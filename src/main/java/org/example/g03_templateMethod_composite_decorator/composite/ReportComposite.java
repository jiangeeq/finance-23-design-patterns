package org.example.g03_templateMethod_composite_decorator.composite;

import org.example.g03_templateMethod_composite_decorator.abstracts.ReportComponent;

import java.util.ArrayList;
import java.util.List;
// 综合报告-组合
public class ReportComposite implements ReportComponent {
    private List<ReportComponent> components = new ArrayList<>();

    public void addComponent(ReportComponent component) {
        components.add(component);
    }

    public void display() {
        for (ReportComponent component : components) {
            component.display();
        }
    }
}
