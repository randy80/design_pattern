package dev.randy80.design_pattern.factory_method;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("HTMLButton render");
    }

    @Override
    public void onClick() {
        System.out.println("HTMLButton onClick");
    }
}
