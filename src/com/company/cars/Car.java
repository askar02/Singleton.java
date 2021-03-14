package com.company.cars;

import com.company.components.Engine;//import Engine class
import com.company.components.GPSNavigator;//import GPSNavigator class
import com.company.components.Transmission;//import Transmission class
import com.company.components.TripComputer;//import TripComputer class

/**
 * Car is a product class.
 */
public class Car {
    private final CarType carType;//variable
    private final int seats;//variable
    private final Engine engine;//variable
    private final Transmission transmission;//variable
    private final TripComputer tripComputer;//variable
    private final GPSNavigator gpsNavigator;//variable
    private double fuel = 0;//variable

    public Car(CarType carType, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;//assigning a value for carType
        this.seats = seats;//assigning a value for seats
        this.engine = engine;//assigning a value for engine
        this.transmission = transmission;//assigning a value for transmission
        this.tripComputer = tripComputer;//assigning a value for tripComputer
        if (this.tripComputer != null) {//if statement for tripComputer if tripComputer is not null
            this.tripComputer.setCar(this);//assigning a value from setter
        }
        this.gpsNavigator = gpsNavigator;//assigning a value for gpsNavigator
    }

    public CarType getCarType() {
        return carType;
    }//Method that return the value of carType

    public double getFuel() {
        return fuel;
    }//Method that return the value of fuel

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }//Method that change the value of fuel

    public int getSeats() {
        return seats;
    }//Method that return the value of seats

    public Engine getEngine() {
        return engine;
    }//Method that return the value of engine

    public Transmission getTransmission() {
        return transmission;
    }//Method that return the value of transmission

    public TripComputer getTripComputer() {
        return tripComputer;
    }//Method that return the value of tripComputer

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }//Method that return the value of gpsNavigator
}