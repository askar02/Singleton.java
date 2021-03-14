package com.company;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> dots=new ArrayList<>();
    public void addPoint(Point dot){
        dots.add(dot);
    }
    public ArrayList<Point> getPoints() {
        return dots;
    }
    public double calculatePerimeter(){
        double p=0;
        for (int i = 0; i < getPoints().size() - 1; i++) {
            p += (getPoints().get(i).distance(getPoints().get(i + 1)));
        }
        return p;
    }
    public double getAverage() {
        return calculatePerimeter() / getPoints().size();
    }
    public double getLongestSide() {
        double longestSide = Double.MIN_VALUE;

        for (int i = 0; i < getPoints().size() - 1; i++) {
            double distance = getPoints().get(i).distance(getPoints().get(i + 1));
            if (distance >= longestSide) {
                longestSide = distance;
            }
        }

        return longestSide;
    }
}