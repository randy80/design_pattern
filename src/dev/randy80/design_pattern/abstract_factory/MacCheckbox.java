package dev.randy80.design_pattern.abstract_factory;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("MacCheckbox");
    }
}
