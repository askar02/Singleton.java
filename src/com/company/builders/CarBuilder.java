package com.company.builders;

import com.company.cars.Car;//import Car class
import com.company.cars.CarType;//import CarType class
import com.company.components.Engine;//import Engine class
import com.company.components.GPSNavigator;//import GPSNavigator class
import com.company.components.Transmission;//import Transmission class
import com.company.components.TripComputer;//import TripComputer class

/**
 * Concrete builders implement steps defined in the common interface.
 */
public class CarBuilder implements Builder {
    private CarType type;//variable
    private int seats;//variable
    private Engine engine;//variable
    private Transmission transmission;//variable
    private TripComputer tripComputer;//variable
    private GPSNavigator gpsNavigator;//variable

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

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }//Method that return the value of Result
}