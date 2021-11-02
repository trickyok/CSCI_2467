package edu.cscc;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Calculate Target Heart Rate and Maximum Heart Rate using the Karvonen Method
 * @author Charles Farmer
 * 11/2/2021
 */
public class Main {
    private static Scanner input = new Scanner(System.in);

    /**
     * Main method - get user input and calculate / output target and maximum heart rate
     * @param args not used
     */
    public static void main(String[] args) {
        double restingHR = getRestingHR();
        double age = getAge();
        System.out.println("Your target heart rate is: " +
                calculateTargetHR(restingHR, age, 0.65) + " to " +
                calculateTargetHR(restingHR, age, 0.85)
        );
        System.out.println("Your maximum heart rate is: "+calculateMaxHR(age));
    }

    /**
     * Get resting heart rate
     * @return resting heart rate
     */
    public static double getRestingHR() {
        double restingHR = 0;
        while (true) {
            System.out.print("Enter your resting heart rate: ");
            try {
                String restingHRString = input.next();
                restingHR = Double.parseDouble(restingHRString);
            }
            catch (InputMismatchException e) {
                restingHR = -1;
                input.nextLine();
            }
            catch (NullPointerException e) {
                restingHR = -2;
                input.nextLine();
            }
            catch (NumberFormatException e) {
                restingHR = -3;
                input.nextLine();
            }
            if (restingHR <= 0) {
                System.out.println("Invalid input");
            }
            else { return restingHR; }
        }
    }

    /**
     * Get person's age (years)
     * @return person's age
     */
    public static double getAge() {
        while (true) {
            double age = 0;
            System.out.print("Enter your age: ");
            try {
                String ageString = input.next();
                age = Double.parseDouble(ageString);
            }
            catch (InputMismatchException e) {
                age = -1;
                input.nextLine();
            }
            catch (NullPointerException e) {
                age = -2;
                input.nextLine();
            }
            catch (NumberFormatException e) {
                age = -3;
                input.nextLine();
            }
            if (age <= 0) {
                System.out.println("Invalid input");
            }
            else { return age; }
        }
    }

    /**
     * Calculate maximum heart rate for aerobic exercise
     * @param age persons are
     * @return maximum hear rate
     */
    public static int calculateMaxHR(double age) {
        double maxHR = 220 - age;
        return (int)maxHR;
    }

    /**
     * Calculate target heart rate for aerobic exercise
     * @param restingHR resting heart rate
     * @param age person age (years)
     * @param intensity intensity of exercise (percentage 0.0 - 1.0)
     * @return target heart rate for a given intensity aerobic workout
     */
    public static int calculateTargetHR(double restingHR, double age, double intensity) {
        double targetHR = (((calculateMaxHR(age) - restingHR) * intensity) + restingHR);
        return (int)targetHR;
    }
}