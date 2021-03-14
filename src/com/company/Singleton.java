package com.company;

public final class Singleton {
    private static Singleton instance;//variable
    public String value;//variable

    private Singleton(String value) {//Singleton method
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {//getter for singleton
        if (instance == null) {//if variable is null
            instance = new Singleton(value);//giving the new value for variable
        }
        return instance;//returning the variable
    }
}
