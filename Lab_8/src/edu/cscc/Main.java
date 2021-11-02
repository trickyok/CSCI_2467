package edu.cscc;
import java.util.Scanner;

/**
 * Calculate Target Heart Rate and Maximum Heart Rate using the Karvonen Method
 * @author student_name
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
        System.out.print("Enter your resting heart rate: ");
        double restingHR = input.nextDouble();
        return restingHR;
    }

    /**
     * Get person's age (years)
     * @return person's age
     */
    public static double getAge() {
        System.out.print("Enter your age: ");
        double age = input.nextDouble();
        return age;
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