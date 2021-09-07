package edu.cscc;

import java.util.Scanner;

/* Gage Farmer
    leapYear.java
    9/7/2021
 */
public class leapYear {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int year;
        String isLeapYear = " ";

        // input
        System.out.print("Input a year: ");
        year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = " is ";
                } else { isLeapYear = " is not "; }
            }
        }

        // output
        System.out.println("The year " + year + isLeapYear + "a leap year.");
    }
}
