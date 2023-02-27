package dev.randy80.design_pattern.abstract_factory;

public class Application {
    private GUIFactory factory;
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

    public static void main(String[] args) {
        Application app = new Application(new WinFactory());
        app.createUI();
        app.paint();

        app = new Application(new MacFactory());
        app.createUI();
        app.paint();
    }
}
