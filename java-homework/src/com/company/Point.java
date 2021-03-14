package com.company;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point{
    private double x,y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point point) {
        double distance = Math.sqrt(Math.pow(point.getX() - getX(), 2) + Math.pow(point.getY() - getY(), 2));
        return distance;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
}