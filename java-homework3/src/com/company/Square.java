package com.company;

public class Square extends  Rectangle{
    private double side;

    public Square() {
        this.side=getLength();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
        setSide(side);
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString(){
        return "Color: " +  getColor() + ", Filled: " + isFilled() + ", width: " + getSide() + ", length" + getSide();
    }
}
