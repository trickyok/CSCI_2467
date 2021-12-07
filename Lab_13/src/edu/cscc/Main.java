package edu.cscc;

import java.util.Map;
import java.util.Scanner;

/**
 * Returns surname + data
 * 12/7/2021
 * @author Charles Farmer
 */
public class Main {
    private final static String CENSUSDATAFNAME = "Surnames_2010Census.csv";
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

	    Map<String,Surname> map = Census.loadCensusData(CENSUSDATAFNAME);

        while (true) {
            System.out.print("Enter a surname (or quit to end): ");
            String surname = input.nextLine();
            surname = surname.toUpperCase();
            if (surname.equals("QUIT")) {
                break;
            }
            if (map.containsKey(surname)) {
                Surname currentSurname = map.get(surname);
                System.out.println("Surname: " + currentSurname.getName());
                System.out.println("Rank: " + currentSurname.getRank());
                System.out.println("Count: " + currentSurname.getCount());
                System.out.println("Proportion: " + currentSurname.getProportion());
            }
            else {
                System.out.print("Surname: " + surname + " not found\n");
            }
        }
    }
}
