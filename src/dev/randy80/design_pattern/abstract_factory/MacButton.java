package dev.randy80.design_pattern.abstract_factory;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("MacButton");
    }
}
