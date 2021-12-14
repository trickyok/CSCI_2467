package edu.cscc;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<String,String> capitals = new TreeMap<>();

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

        for (String country : capitals.keySet()) {
            System.out.println("The capital of "+country+" is "+capitals.get(country));
        }
    }
}
