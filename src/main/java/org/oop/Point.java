package org.oop;

public class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point createOrigin(){
        return new Point(0,0);
    }

    public static Point createPointOnX(int x){
        return new Point(x, 0);
    }

    public static Point createPointOnY(int y){
        return new Point(0, y);
    }

    public static double distance(Point from, Point to) {
        double xDistance = getXDistance(from, to);
        double yDistance = getYDistance(from, to);
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public static double direction(Point from, Point to) {
        double xDistance = getXDistance(from, to);
        double yDistance = getYDistance(from, to);
        return Math.atan2(yDistance, xDistance);
    }

    private static double getYDistance(Point from, Point to) {
        return to.getY() - from.getY();
    }

    private static double getXDistance(Point from, Point to) {
        return to.getX() - from.getX();
    }
}
