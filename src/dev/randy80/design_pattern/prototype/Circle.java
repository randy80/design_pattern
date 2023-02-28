package dev.randy80.design_pattern.prototype;

public class Circle extends Shape{
    private int radius;

    public Circle() {
        super();
    }

    public Circle(Circle target) {
        super(target);
        if(target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
