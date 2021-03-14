package com.company.components;

/**
 * Just another feature of a car.
 */
public class GPSNavigator {
    private String route;//variable

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }//assigning a value for route

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }//method that return route variable
}