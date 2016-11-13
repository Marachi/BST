package tasks.task3.ent;

/**
 * Created by Potaychuk on 12.11.2016.
 */
public class Circle implements Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return Math.PI*radius*radius;
    }
}
