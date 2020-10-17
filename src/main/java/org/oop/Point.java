package org.oop;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculateXDistance(Point oppositePoint) {
        return oppositePoint.x - this.x;
    }

    public double calculateYDistance(Point oppositePoint) {
        return oppositePoint.y - this.y;
    }
}
