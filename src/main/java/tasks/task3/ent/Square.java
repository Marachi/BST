package tasks.task3.ent;

/**
 * Created by Potaychuk on 12.11.2016.
 */
public class Square implements Shape {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSquare() {
        return side*side;
    }
}
