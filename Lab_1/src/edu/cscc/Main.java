package edu.cscc;

import java.util.Scanner;
import java.lang.Math;

/* Gage Farmer
   8/31/21
   Calculates distance and final velocity
   of the falling object */
public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Declarations
	    double time, distance, velocity, accel;
	    String unit, unitSeconds;

	    // Unit Toggle
        System.out.print("Would you like this to calculate in meters instead? (Y/N): ");
        String answer = input.next();
        unit = ("Y".equals(answer)) ? "meters" : "feet";
        unitSeconds = ("Y".equals(answer)) ? "meters/sec." : "feet/sec.";
        accel = ("Y".equals(answer)) ? 9.8 : 32;

	    // Input Statement
        System.out.print("Enter time (secs): ");
        time = input.nextDouble();

        // Calculations
        distance = 0.5 * accel * Math.pow(time, 2);
        velocity = accel * time;

        // Output statement
        System.out.println("Distance: " + distance + " " + unit);
        System.out.println("Velocity: " + velocity + " " + unitSeconds);
    }
}
