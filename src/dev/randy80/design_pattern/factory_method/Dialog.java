package dev.randy80.design_pattern.factory_method;

public abstract class Dialog {
    public void render() {
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    }

    abstract public Button createButton();
}
