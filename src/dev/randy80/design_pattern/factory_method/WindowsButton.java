package dev.randy80.design_pattern.factory_method;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("WindowsButton render");
    }

    @Override
    public void onClick() {
        System.out.println("WindowsButton onClick");
    }
}
