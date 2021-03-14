package com.company;

public class Rectangle<T extends Number> extends Shape{
    private double T width;
    private double T length;

    public Rectangle(){
        this.width = 1.0;
        this.length=1.0;
    }

    public Rectangle(double T width, double T length) {
        this.width=width;this.length=length;
    }

    public Rectangle(double width,double length, String color, boolean filled){
        super(color, filled);
        setWidth(width);
        setLenght(length);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLenght(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return length*2+width*2;
    }

    @Override
    public String toString(){
        return "Color: " +  getColor() + ", Filled: " + isFilled() + ", width: " + getWidth() + ", length" + getLength();
    }
}
