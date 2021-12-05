package task5;

public class Circle extends Shape {
    private double radius;
    private int x, y;

    public Circle() {
        radius = 1;
        x = 0;
        y = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
        x = 0;
        y = 0;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() { return radius*radius*Math.PI; }

    @Override
    public double getPerimetr() {
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", perimetr=" + getPerimetr() + ", area=" + getArea() + '}';
    }
}
