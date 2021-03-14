package com.company;

public class Circle <T extends Number> extends Shape {
    private double T radius;

    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        setRadius(radius);
    }


    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString(){
        return "Color: " +  getColor() + ", Filled: " + isFilled() + ", Radius: " + getRadius();
    }
}
