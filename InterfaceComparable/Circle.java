package Lesson7.InterfaceComparable;

public class Circle {
    private double radius = 1.0;
    private String color;
    private  boolean filled;


    public Circle() {
    }

    public Circle(String color, boolean filled, double radius) {
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius=radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
