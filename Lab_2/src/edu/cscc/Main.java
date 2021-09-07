package edu.cscc;

import java.util.Scanner;

/* Gage Farmer
   Hurricane Wind Scale
   9/7/2021
 */
public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        long speed;
        String classification;

        // input
        System.out.print("Enter wind speed (mph): ");
        speed = input.nextLong();

        // nested if statements
        if (38 >= speed && speed >= 0) {
            classification = "Not in scale";
        } else if (73 >= speed && speed >= 39) {
            classification = "Tropical Storm";
        } else if (95 >= speed && speed >= 74) {
            classification = "Category One Hurricane";
        } else if (110 >= speed && speed >= 75) {
            classification = "Category Two Hurricane";
        } else if (129 >= speed && speed >= 111) {
            classification = "Category Three Hurricane";
        } else if (156 >= speed && speed >= 130) {
            classification = "Category Four Hurricane";
        } else if (speed >= 157) {
            classification = "Category Five Hurricane";
        } else {
            classification = "Invalid input";
        }

        // output
        System.out.println("Classification: " + classification);
    }
}
