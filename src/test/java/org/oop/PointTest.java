package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.oop.Point.*;

public class PointTest {
    // Can be renamed as PointTest.
    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 0);

        double distance = distance(point1, point2);

        Assertions.assertEquals(0, distance);
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = createOrigin();
        Point pointOnUnitCircle = new Point(1, 0);

        double distance = distance(origin, pointOnUnitCircle);

        Assertions.assertEquals(1, distance);

    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point pointOnUnitCircle1 = new Point(1, 0);
        Point pointOnUnitCirlce2 = new Point(-1, 0);

        double distance = distance(pointOnUnitCircle1, pointOnUnitCirlce2);

        Assertions.assertEquals(2, distance);
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
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() { // Rename the method
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
