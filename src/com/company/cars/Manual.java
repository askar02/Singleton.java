package com.company.cars;

import com.company.components.Engine;//import Engine class
import com.company.components.GPSNavigator;//import GPSNavigator class
import com.company.components.Transmission;//import Transmission class
import com.company.components.TripComputer;//import TripComputer class

/**
 * Car manual is another product. Note that it does not have the same ancestor
 * as a Car. They are not related.
 */
public class Manual {
    private final CarType carType;//variable
    private final int seats;//variable
    private final Engine engine;//variable
    private final Transmission transmission;//variable
    private final TripComputer tripComputer;//variable
    private final GPSNavigator gpsNavigator;//variable

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;//assigning a value for carType
        this.seats = seats;//assigning a value for seats
        this.engine = engine;//assigning a value for engine
        this.transmission = transmission;//assigning a value for transmission
        this.tripComputer = tripComputer;//assigning a value for tripComputer
        this.gpsNavigator = gpsNavigator;//assigning a value for gpsNavigator
    }

    public String print() {//method that print our console
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
}