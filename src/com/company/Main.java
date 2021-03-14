package com.company;

/** Builder java import */
//import com.company.builders.CarBuilder;
//import com.company.builders.CarManualBuilder;
//import com.company.cars.Car;
//import com.company.cars.Manual;
//import com.company.director.Director;

/** Factory method import*/
import com.company.factory.Dialog;
import com.company.factory.HtmlDialog;
import com.company.factory.WindowsDialog;

public class Main {
    /** Factory method*/
    private static Dialog dialog;

    public static void main(String[] args) {
        /** Singleton main */
//        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
//                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
//                "RESULT:" + "\n");
//        Singleton singleton = Singleton.getInstance("FOO");//give the "FOO" value for singleton
//        Singleton anotherSingleton = Singleton.getInstance("BAR");//give another value for singleton
//        System.out.println(singleton.value);//output the first value
//        System.out.println(anotherSingleton.value);//output the second value, but by singleton class

        /** Builder java main*/
//        Director director = new Director();
//
//        // Director gets the concrete builder object from the client
//        // (application code). That's because application knows better which
//        // builder to use to get a specific product.
//        CarBuilder builder = new CarBuilder();
//        director.constructSportsCar(builder);
//
//        // The final product is often retrieved from a builder object, since
//        // Director is not aware and not dependent on concrete builders and
//        // products.
//        Car car = builder.getResult();
//        System.out.println("Car built:\n" + car.getCarType());
//
//
//        CarManualBuilder manualBuilder = new CarManualBuilder();
//
//        // Director may know several building recipes.
//        director.constructSportsCar(manualBuilder);
//        Manual carManual = manualBuilder.getResult();
//        System.out.println("\nCar manual built:\n" + carManual.print());

        /** Factory method*/
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
