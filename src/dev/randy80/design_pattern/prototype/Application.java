package dev.randy80.design_pattern.prototype;

public class Application {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        shape.setX(10);
        shape.setY(20);
        shape.setColor("red");
        System.out.println(shape);

        Shape clonedShape = shape.clone();
        System.out.println(clonedShape);
    }
}
