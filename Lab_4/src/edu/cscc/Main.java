package edu.cscc;

import java.util.Arrays;
import java.util.Scanner;

/* Gage Farmer
    9/21/21
    Keeps track of items input to a grocery list
 */
public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0; // Number of items currently in the grocery list
        String item; // Item to be added to list
        String[] groceryList = new String[6]; // List of items

        /* Loop that gets item input, then checks
        to see if it's already in the list, and
        adds it if not.
         */
        while (count < 6) {
            System.out.print("Enter grocery item: ");
            item = input.nextLine();
            if (isDuplicate(item, groceryList, count)) {
                System.out.println("Sorry, item: " + item + " is a duplicate");
            }
            else { groceryList[count] = item; count++; }
        }

        // Sorts array
        Arrays.sort(groceryList);

        // Prints out grocery list
        System.out.println();
        System.out.println("Your Grocery List");
        for (int i = 0; i < count; i++) {
            System.out.println(groceryList[i]);
        }
    }

    /* Takes item and checks to see if it's in the array or not.
    If count of items is 0, false is returned
     */
    public static boolean isDuplicate(String item, String[] list, int listcnt) {

        if (listcnt > 0) {
            return Arrays.asList(list).contains(item);
        }
        // If empty list
        else { return false; }
    }
}