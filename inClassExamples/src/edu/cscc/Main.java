package edu.cscc;
import java.util.Scanner;

/* Gage Farmer
10/5/21
Fill up and empty a water bottle lol */
public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        waterBottle bottle = new waterBottle();

        // Getting values from user
        System.out.println("Enter the height of the bottle in millimeters. ");
        bottle.setHeight(input.nextDouble());
        System.out.println("Enter the radius of the bottle in millimeters. ");
        bottle.setRadius(input.nextDouble());
        System.out.println("What percent of the bottle is filled?");
        bottle.setPercentFilled(input.nextInt());
        bottle.calcVolumes();

        /* """UI""" loop for displaying bottle, modifying values,
        and displaying values. */
        boolean exit = false;
        do {
            System.out.println(bottle.print());
            boolean validCheck = false;

            do {
                System.out.println("What would you like to do?");
                System.out.println("Drink (D)\nFill Bottle (F)\nFind Water Volume (W)\n" +
                        "Find Bottle Volume (B)\nFind Current Percentage (P)\nExit Program (E)");
                String ans = input.next();

                if (ans.equalsIgnoreCase("d")) {
                    bottle.drinkWater();
                    validCheck = true;
                } else if (ans.equalsIgnoreCase("f")) {
                    bottle.fillBottle();
                    validCheck = true;
                } else if (ans.equalsIgnoreCase("e")) {
                    exit = true;
                    validCheck = true;
                } else if (ans.equalsIgnoreCase("w")) {
                    System.out.println("\nThere is "+Math.round(bottle.getWaterVolume())+" ml of water in the bottle\n");
                } else if (ans.equalsIgnoreCase("b")) {
                    System.out.println("\nThere is "+Math.round(bottle.getTotalVolume())+" ml of space in the bottle\n");
                } else if (ans.equalsIgnoreCase("p")) {
                    System.out.println("\nThe bottle is "+Math.round(bottle.getPercentFilled())+"% filled");
                } else { System.out.println("Invalid response, please try again."); }

            } while (!validCheck);
        } while (!exit);
    }
}
