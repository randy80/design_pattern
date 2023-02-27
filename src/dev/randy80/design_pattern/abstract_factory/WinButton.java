package dev.randy80.design_pattern.abstract_factory;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("WinButton");
    }
}
