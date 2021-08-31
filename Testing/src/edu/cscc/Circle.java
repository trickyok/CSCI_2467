package edu.cscc;
import java.util.*;
import java.math.*;

// Gage Farmer, 8/31/21
// Calculates the area of a circle
public class Circle {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Declarations & Assignments
        double radius, area, pi;
        pi = Math.PI;

        // Input
        System.out.print("Enter the radius of the circle: ");
        radius = input.nextDouble();

        // Calculations
        area = pi * (Math.pow(radius, 2));

        // Output statement
        System.out.println("The area of the circle with radius "
                + radius + " is " + area);
    }
}
