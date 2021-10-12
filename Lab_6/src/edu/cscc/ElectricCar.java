package edu.cscc;

public class ElectricCar extends Car {

    // init
    private int batterySize;

    // constructor
    public ElectricCar(String make, String model, int year, int batterySize) {
        super(make, model, year);
        this.batterySize = batterySize;
    }

    // getter and setter
    public int getBatterySize() { return batterySize; }
    public void setBatterySize(int batterySize) { this.batterySize = batterySize; }

    // override
    public void describe() {
        super.describe();
        System.out.println("Battery Size: "+getBatterySize());
    }
}
