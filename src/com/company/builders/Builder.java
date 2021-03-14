package com.company.builders;

import com.company.cars.CarType;//import CarType class
import com.company.components.Engine;//import Engine class
import com.company.components.GPSNavigator;//import GPSNavigator class
import com.company.components.Transmission;//import Transmission class
import com.company.components.TripComputer;//import TripComputer class

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {//builder interface
    void setCarType(CarType type);//
    void setSeats(int seats);//
    void setEngine(Engine engine);//
    void setTransmission(Transmission transmission);//
    void setTripComputer(TripComputer tripComputer);//
    void setGPSNavigator(GPSNavigator gpsNavigator);//
}