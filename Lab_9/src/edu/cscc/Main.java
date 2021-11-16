package edu.cscc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Prints out a list of PC components alongside
 * their quantity and price, followed by a total price
 * @author Charles Farmer
 */
public class Main {
    static final String INPUTFILE = "components.txt";
    static final String PRINTFFORMAT = "%20s %2d    %6.2f\n";
    public static void main(String[] args) {
        Scanner input = null;
    	double total = 0;
    	int quantity = 0;
    	double price = 0;
	    File infile = new File(INPUTFILE);
	    System.out.printf("%s%n","           Component Units Price");

	    /* TODO -
	        add code that reads the input file (DONE)
	        calculates total cost (DONE)
	        prints a component report (DONE)
        */
        try {
            input = new Scanner(infile);

            while (input.hasNext()) {
                String s = input.nextLine();
                String parts[] = s.split(",");
                try {
                    price = Double.parseDouble(parts[2]);
                    quantity = Integer.parseInt(parts[1]);
                } catch (NumberFormatException ex) {
                    System.out.println("There is a formatting error in " + INPUTFILE);
                }
                total += quantity * price;
                System.out.printf(PRINTFFORMAT, parts[0], quantity, price);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Cannot access file " + INPUTFILE);
        } finally {
            if (input != null) input.close();
        }

	    System.out.println("Total cost: "+total);
    }
}
