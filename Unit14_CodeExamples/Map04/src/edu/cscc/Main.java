package edu.cscc;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String,String> capitals = new HashMap<>();

        capitals.put("United States","Washington, DC");
        capitals.put("United Kingdom","London");
        capitals.put("Canada","Ottawa");
        capitals.put("Brazil","Brasilia");
        capitals.put("Kenya","Nairobi");
        capitals.put("Australia","Canberra");
        capitals.put("Japan","Tokyo");
        capitals.put("France","Paris");
        capitals.put("Russia","Moscow");
        capitals.put("India","New Delhi");
        capitals.put("Spain","Madrid");
        capitals.put("China","Beijing");

        System.out.println("Capital Quiz");
        for (String country : capitals.keySet()) {
            System.out.print("What is the capital of "+country+"? ");
            String answer = input.nextLine().trim();
            String capital = capitals.get(country);
            if (answer.equalsIgnoreCase(capital)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong, the capital is: "+capital);
            }
        }
    }
}
