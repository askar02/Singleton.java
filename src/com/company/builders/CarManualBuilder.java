package com.company.builders;

import com.company.cars.Manual;//import Manual class
import com.company.cars.CarType;//import CarType class
import com.company.components.Engine;//import Engine class
import com.company.components.GPSNavigator;//import GPSNavigator class
import com.company.components.Transmission;//import Transmission class
import com.company.components.TripComputer;//import TripComputer class

/**
 * Unlike other creational patterns, Builder can construct unrelated products,
 * which don't have the common interface.
 *
 * In this case we build a user manual for a car, using the same steps as we
 * built a car. This allows to produce manuals for specific car models,
 * configured with different features.
 */
public class CarManualBuilder implements Builder{
    private CarType type;//variable
    private int seats;//variable
    private Engine engine;//variable
    private Transmission transmission;//variable
    private TripComputer tripComputer;//variable
    private GPSNavigator gpsNavigator;//variable

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }//Override Method that change the value of CarType.

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }//Override Method that change the value of Seats.

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }//Override Method that change the value of Engine.

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }//Override Method that change the value of Transmission.

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }//Override Method that change the value of TripComputer.

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }//Override Method that change the value of GPSNavigator.

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }//Method that return the value of Result
}