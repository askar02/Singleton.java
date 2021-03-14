package com.company;

import java.util.ArrayList;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        this.color = "green"; // setColor("green");
        this.filled = true; // setFilled(true);
    }

    public Shape(String color, boolean filled){
        setColor(color);
        setFilled(filled);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString(){
        return "Color = " + this.color + ", Filled = " + this.filled;
    }



}
