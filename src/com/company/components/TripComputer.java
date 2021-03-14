package com.company.components;

import com.company.cars.Car;

/**
 * Just another feature of a car.
 */
public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }//method that change the value of Car

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }//method that that print the level of fuel

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }//method that make you know, car is started or not
}