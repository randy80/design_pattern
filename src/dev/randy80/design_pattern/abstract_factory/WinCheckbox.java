package dev.randy80.design_pattern.abstract_factory;

public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("WinCheckbox");
    }
}
