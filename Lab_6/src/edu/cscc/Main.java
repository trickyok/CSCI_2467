package edu.cscc;

// TODO Add student name, date, purpose of program
public class Main {

    static Car[] carFleet = {
            /* TODO - uncomment gasoline cars
            new GasolineCar("Toyota", "Rav4", 2015, 4, 15.5),
            new GasolineCar("Ford", "F-150", 2017, 6, 20.1),
            new GasolineCar("Honda", "Civic", 2012, 4,  12.4),
             ***/

            /* TODO - uncomment electric cars
            new ElectricCar("Tesla", "Model 3", 2020, 55),
            new ElectricCar("Tesla", "Model Y", 2021, 58),
            new ElectricCar("Aston Martin", "Rapide E", 2020, 65)
             ***/
    };

    public static void main(String[] args) {
        System.out.println("*** Our Car Fleet ***");

        if (carFleet.length > 0) {
            int vehno = 1;
            for (Car car : carFleet) {
                System.out.println("--- Vehicle #" + vehno + " ---");
                car.describe();
                vehno++;
            }
        }
    }
}
