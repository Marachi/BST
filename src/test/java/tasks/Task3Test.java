package tasks;

import org.junit.Test;
import tasks.task3.calculator.ShapeCalculator;
import tasks.task3.calculator.SquareShapeCalculator;
import tasks.task3.ent.Circle;
import tasks.task3.ent.Rectangle;
import tasks.task3.ent.Shape;
import tasks.task3.ent.Square;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Potaychuk on 12.11.2016.
 */
public class Task3Test {

    @Test
    public void calculateSingleShapeTest() throws Exception {
        double testSide = 10;
        Square shape = new Square(testSide);
        ShapeCalculator shapeCalculator = new SquareShapeCalculator();
        assertTrue(shapeCalculator.calculate(shape)==testSide*testSide);
    }

    @Test
    public void calculateMultiShapesTest() throws Exception {
        double testSide = 5;
        double testRadius = 12;
        double testLength = 12;
        double testWidth = 20;
        Shape circle = new Circle(testRadius);
        Shape rectangle = new Rectangle(testLength, testWidth);
        Shape square = new Square(testSide);
        ShapeCalculator shapeCalculator = new SquareShapeCalculator();
        assertTrue(shapeCalculator.calculate(circle,rectangle,square)==(Math.PI*testRadius*testRadius+testLength*testWidth+testSide*testSide));
    }

}