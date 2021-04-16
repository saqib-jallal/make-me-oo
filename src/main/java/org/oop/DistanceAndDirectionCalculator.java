package org.oop;
// Can be added inside Point-class itself as there will be encapsulation i.e, data and the methods acting on it are encapsulated in the same place.
// Clean code - Redundant calculations can be removed.
public class DistanceAndDirectionCalculator {
    public static double distance(Point from, Point to) {
        double xDistance = to.getX() - from.getX();
        double yDistance = to.getY() - from.getY();
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public static double direction(Point from, Point to) {
        double xDistance = to.getX() - from.getX();
        double yDistance = to.getY() - from.getY();
        return Math.atan2(yDistance, xDistance);
    }
}
