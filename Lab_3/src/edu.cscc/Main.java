package edu.cscc;

import java.util.Scanner;

/* Gage Farmer
    Body Mass Index
    9/14/2021
 */
public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double lbs, inches, meters, kgs, bmi;
        String classification;

        // Inputs
        System.out.println("Calculate BMI");
        System.out.print("Enter weight (lbs): ");
        lbs = input.nextDouble();
        System.out.print("Enter height (inches): ");
        inches = input.nextDouble();

        // Method calls
        kgs = convertToKilograms(lbs);
        meters = convertToMeters(inches);
        bmi = calcBMI(kgs, meters);
        classification = bmiClassification(bmi);

        // Output
        System.out.println("Your BMI is " + bmi);
        System.out.println("Your BMI classification is " + classification);
    }

    // Converts height in inches to meters
    public static double convertToMeters(double inches) {
        return inches / 39.37;
    }

    // Converts weight in pounds to kilograms
    public static double convertToKilograms(double lbs) {
        return lbs / 2.2046;
    }

    // Calculates the BMI
    public static double calcBMI(double kgs, double meters) {
        return kgs / (meters * meters);
    }

    // Determines the BMI classification
    public static String bmiClassification(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else { return "Obese"; }
    }
}

