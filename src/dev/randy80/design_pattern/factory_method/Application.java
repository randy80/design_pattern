package dev.randy80.design_pattern.factory_method;

public class Application {
    public static void main(String[] args) {
        Dialog dialog = new WindowsDialog();
        dialog.render();

        dialog = new WebDialog();
        dialog.render();
    }
}
