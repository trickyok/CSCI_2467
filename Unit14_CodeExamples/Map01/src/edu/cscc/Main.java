package edu.cscc;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();

        capitals.put("United States", "Washington, DC");
        capitals.put("United Kingdom", "London");
        capitals.put("Canada", "Ottawa");
        capitals.put("Brazil", "Brasilia");
        capitals.put("Kenya", "Nairobi");
        capitals.put("Australia", "Canberra");
        capitals.put("Japan", "Tokyo");
        capitals.put("France", "Paris");
        capitals.put("Russia", "Moscow");
        capitals.put("India", "New Delhi");
        capitals.put("Spain", "Madrid");
        capitals.put("China", "Beijing");

        System.out.print("Enter country name: ");
        String country = input.nextLine();

        String capital = capitals.getOrDefault(country, "Not found");
        System.out.println("Capital of " + country + ": " + capital);
    }
}
