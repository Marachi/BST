package tasks.task3.calculator;

import tasks.task3.ent.Shape;

/**
 * Created by Potaychuk on 12.11.2016.
 */
public class SquareShapeCalculator implements ShapeCalculator {

    public double calculate(Shape... shape) {
        double temp=0;
        for (Shape s:shape) {
            temp+=s.getSquare();
        }
        return temp;
    }
}
