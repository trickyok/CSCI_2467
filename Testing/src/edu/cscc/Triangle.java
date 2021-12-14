package edu.cscc;
import java.util.*;

// Gage Farmer, 8/31/21
// Computes the area of a triangle with user input
public class Triangle {
    private static Scanner input = new Scanner(System.in);

    public static void main() {
        // Declarations
        double base, height, area;

        // Input
        System.out.print("Enter height of the triangle: ");
        height = input.nextDouble();
        System.out.print("Enter base of the triangle: ");
        base = input.nextDouble();

        // Computation
        area = 0.5 * base * height;

        // Output statement
        System.out.println("The area of a triangle with base " + base +
                " and height " + height +
                " is " + area);
    }
}
