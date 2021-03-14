package com.company.components;

/**
 * Just another feature of a car.
 */
public class Engine {
    private final double volume;//variable
    private double mileage;//variable
    private boolean started;//variable

    public Engine(double volume, double mileage) {
        this.volume = volume;//assigning a value for volume
        this.mileage = mileage;//assigning a value for mileage
    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }//method that return started variable

    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

    public double getVolume() {
        return volume;
    }//method that return volume variable

    public double getMileage() {
        return mileage;
    }//method that return mileage variable
}