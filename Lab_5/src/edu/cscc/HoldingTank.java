package edu.cscc;

/* Gage Farmer
10/12/2021
HoldingTank.java- is a class which
creates a tank of water, and allows
the user to alter it and see the capacity
as they desire
 */
public class HoldingTank {

    // initialization
    private int current, maxCapacity;

    // constructor
    public HoldingTank(int current, int maxCapacity) {
        this.current = current;
        this.maxCapacity = maxCapacity;

        if (this.current > this.maxCapacity) {
            this.current = this.maxCapacity;
        }
    }

    // getters (unused because not necessary within code)
    public int getCurrent() {
        return current;
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }

    // add given volume to the tank
    void add(int volume) {
        this.current += volume;

        if (this.current > this.maxCapacity) {
            this.current = this.maxCapacity;
        }
    }

    // remove given volume from the tank
    void drain(int volume) {
        this.current -= volume;

        if (this.current < 0) {
            this.current = 0;
        }
    }

    // print current volume
    void print() {
        System.out.println("The tank volume is "+this.current+" gallons");
    }
}
