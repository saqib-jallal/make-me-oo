package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.oop.Point.*;

public class PointTest {

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
        Point pointOnUnitCircle2 = new Point(-1, 0);

        double distance = distance(pointOnUnitCircle1, pointOnUnitCircle2);

        Assertions.assertEquals(2, distance);
    }

    @Test
    void originAndPointOnPositiveXAxisShouldBeZeroRadiansAway() {
        Point origin = createOrigin();
        Point pointOnPositiveX = createPointOnX(1);

        double direction = direction(origin, pointOnPositiveX);

        Assertions.assertEquals(0, direction);
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = createOrigin();
        Point pointOnNegativeX = createPointOnX(-1);

        double direction = direction(origin, pointOnNegativeX);

        Assertions.assertEquals(Math.PI, direction);
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
