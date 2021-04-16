package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.oop.DistanceAndDirectionCalculator.direction;

public class DistanceAndDirectionCalculatorTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);
        Assertions.assertEquals(0, DistanceAndDirectionCalculator.distance(origin, origin));
        // Should have compared it by creating two Point-objects with same x and y coordinates.
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);

        Assertions.assertEquals(1, DistanceAndDirectionCalculator.distance(origin, point1));
        Assertions.assertEquals(1, DistanceAndDirectionCalculator.distance(origin, point2));
        // Can have a factory method for creating point on unit circle under Point-class and can receive an argument ANGLE at which the point is to be created.
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);

        Assertions.assertEquals(2, DistanceAndDirectionCalculator.distance(point1, point2));
        // Should have created two points using createPointOnUnitCircle(factory-method) by giving angles of 180deg off.
    }

    @Test
    void originAndPointOnPositiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);

        Assertions.assertEquals(0, direction(origin, point1));
        Assertions.assertEquals(0, direction(origin, point2));
        // Can have a factory-method for creating a point on origin.
        // Can have a factory-method for creating a point on x and/or y axis.
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);

        Assertions.assertEquals(Math.PI, direction(origin, point1));
        Assertions.assertEquals(Math.PI, direction(origin, point2));
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);

        Assertions.assertEquals(Math.PI / 2, direction(origin, point2));
        Assertions.assertEquals(Math.PI / 2, direction(origin, point1));
    }
}
